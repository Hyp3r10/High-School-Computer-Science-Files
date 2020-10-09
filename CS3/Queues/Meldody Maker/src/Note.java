// CSE 143, Homework 2: Melody
//
// Instructor-provided code.
// A Note object represents a musical note in scientific music notation. 
// For example, middle C is represented as C4.

public class Note {
   private Pitch note;
   private double duration;
   private int octave;
   private Accidental accidental;
   private boolean repeat;
   
   // pre : duration > 0 and 0 <= octave <= 10, otherwise throws an IllegalArgumentException
   // constructs a note with the provided duration, pitch, octave, accidental 
   //       and repeat settings.
   public Note(double duration, Pitch note, int octave, Accidental accidental, boolean repeat) {
      if(duration <= 0 || octave < 0 || octave > 10) {
         throw new IllegalArgumentException();
      }
      this.note = note;
      this.duration = duration;
      this.octave = octave;
      this.accidental = accidental;
      this.repeat = repeat;
   }
   
   // pre : duration > 0, otherwise throws an IllegalArgumentException
   // constructs a note with the passed in duration, pitch and repeat settings. 
   public Note(double duration, Pitch note, boolean repeat) {
      this(duration, note, 0, Accidental.NATURAL, repeat);
   }
   
   // returns the length of the note in seconds
   public double getDuration() {
      return duration;
   }
   
   // returns the Accidental value of the note
   public Accidental getAccidental() {
      return accidental;
   }
   
   // returns the octave of the note
   public int getOctave() {
      return octave;
   }
   
   // returns the pitch of the note (A - G or R of it is a rest)
   public Pitch getPitch() {
      return note;
   }
   
   // pre : d must be greater than 0, otherwise an IllegalArgumentException is thrown
   // sets the duration of the note to be the given time
   public void setDuration(double d) {
      if(d <= 0) {
         throw new IllegalArgumentException();    
      }
      duration = d;
   }
   
   // sets the accidental of the note to be the given accidental
   public void setAccidental(Accidental a) {
      accidental = a;
   }
   
   // pre : octave must be greater than 0 and less than 10, 
   //       otherwise an IllegalArgumentException is thrown
   // sets the octave of the note to be the passed in octave
   public void setOctave(int octave) {
      if(octave < 0 || octave > 10) {
         throw new IllegalArgumentException();    
      }
      this.octave = octave;
   }
   
   // sets the pitch of the note to be the passed in pitch
   public void setPitch(Pitch pitch) {
      note = pitch;
   }
   
   // sets the repeat of the note to be the passed in repeat
   public void setRepeat(boolean repeat) {
      this.repeat = repeat;
   }
   
   // returns true if the note is the beginning or ending note in a repeated section, 
   //       false otherwise
   public boolean isRepeat() {
      return repeat;
   }
   
   // plays the sound this note represents
   public void play() {
      StdAudio.play(duration, note, octave, accidental);
   }
   
   // returns a string in the format "<duration> <pitch> <repeat>" if the note is a rest,
   //       otherwise returns a string in the format: 
   //       "<duration> <pitch> <octave> <accidental> <repeat>"
   //       For example "2.3 A 4 SHARP true" and "1.5 R true".
   public String toString() {
      if(note.equals(Pitch.R)) {
         return duration + " " + note + " " + repeat;
      } else {
         return duration + " " + note + " " + octave + " " + accidental + " " + repeat;
      }
   }
}