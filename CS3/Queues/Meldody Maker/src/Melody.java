import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Melody {
	private Queue<Note> notes = new LinkedList<Note>(); 
	/**
	 * Initializes the notes object to be equal to the passed
	 * song variable. Notes has been instantiated prior to this.
	 * @param song	the passed Queue of Note objects to be used for the notes object
	 */
	public Melody(Queue<Note> song) {
		this.notes = song;
	}
	/**
	 * Calculates the total length of the songs in seconds
	 * @return	The time of the song in seconds
	 */
	public double getTotalDuration() {
		double total = 0.0;
		Queue<Note> copy = new LinkedList<Note>();
		Queue<Note> repeat = new LinkedList<Note>();
		copy.addAll(this.notes);
		boolean toRepeat = false;
		while(!this.notes.isEmpty()) {
			Note curr = this.notes.poll();
			total += curr.getDuration();
			// if the current note is a repeat
			if(curr.isRepeat()) {
				// If we have run into a repeat and this is the second repeat...
				if(toRepeat) {
					// Add the current note to the repeat queue
					repeat.add(curr);
					// Pause and play all of the notes from the repeated section.
					while(!repeat.isEmpty()) {
						total += repeat.poll().getDuration();
					}
					toRepeat = false;
				}
				else {
					// reset the repeat Queue so that it is accurate
					toRepeat = true;
					repeat = new LinkedList<Note>();
				}
			}
			// If we have run into a repeat, then add the current element until we hit the next repeat
			if(toRepeat) {
				repeat.add(curr);
			}
		}
		this.notes.addAll(copy);
		return total;
	}
	/**
	 * Alters all of the Note Objects inside of notes to be 
	 * of duration * tempo time. 
	 * @param tempo	A double indicating the precent change to be 
	 *				applied to the Notes
	 */
	public void changeTempo(double tempo) {
		Queue<Note> temp = new LinkedList<Note>();
		while(!this.notes.isEmpty()) {
			Note curr = this.notes.poll();
			curr.setDuration(curr.getDuration() / tempo);
			temp.add(curr);
		}
		this.notes = temp;
	}
	/**
	 * Reverses the Queue by putting in the elements into a Stack and then 
	 * takes the elements back into the original Queue.
	 */
	public void reverse() {
		Stack<Note> temp = new Stack<Note>();
		while(!this.notes.isEmpty()) {
			temp.add(this.notes.poll());
		}
		while(!temp.isEmpty()) {
			this.notes.add(temp.pop());
		}
	}
	/**
	 * Returns the notes from the global varaible notes
	 * @return The global variable, notes
	 */
	public Queue<Note> getNotes() {
		return this.notes;
	}
	/**
	 * Add all of the notes from the other Melody object to the 
	 * global variable, notes, by using addAll()
	 * @param other
	 */
	public void append(Melody other) {
		this.notes.addAll(other.notes);
	}
	/**
	 * Play the song in its entirety. Goes through the queue of notes until 
	 * there are no more new notes to play. 
	 */
	public void play() {
		Queue<Note> copy = new LinkedList<Note>();
		Queue<Note> repeat = new LinkedList<Note>();
		copy.addAll(this.notes);
		boolean toRepeat = false;
		while(!this.notes.isEmpty()) {
			Note curr = this.notes.poll();
			curr.play();
			// if the current note is a repeat
			if(curr.isRepeat()) {
				// If we have run into a repeat and this is the second repeat...
				if(toRepeat) {
					// Add the current note to the repeat queue
					repeat.add(curr);
					// Pause and play all of the notes from the repeated section.
					while(!repeat.isEmpty()) {
						repeat.poll().play();
					}
					toRepeat = false;
				}
				else {
					// reset the repeat Queue so that it is accurate
					toRepeat = true;
					repeat = new LinkedList<Note>();
				}
			}
			// If we have run into a repeat, then add the current element until we hit the next repeat
			if(toRepeat) {
				repeat.add(curr);
			}
		}
		this.notes.addAll(copy);
	}
	@Override
	public String toString() {
		String output = "";
		for(Note curr : this.notes) {
			output += curr.toString();
		}
		return output;
	}
} 
