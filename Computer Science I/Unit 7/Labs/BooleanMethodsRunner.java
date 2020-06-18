public class BooleanMethodsRunner
{
	public static void main(String[] args)
    {
        BooleanMethods app = new BooleanMethods();

        System.out.println();
        System.out.println(" Test firstLast method");
        System.out.println(" =====================");
        System.out.println(" The first and last of dependable are same - " + app.firstLast("dependable"));
        System.out.println(" The first and last of steadfastness are same - " + app.firstLast("steadfastness"));

        System.out.println();
        System.out.println(" Test sameLength method");
        System.out.println(" ======================");
        System.out.println(" Charity and selfless are same length - " + app.sameLength("charity", "selfless"));
        System.out.println(" Liberty and freedom are same length - " + app.sameLength("liberty", "freedom"));

        System.out.println();
        System.out.println(" Test firstLast2 method");
        System.out.println(" =====================");
        System.out.println(" The first and last of trust are same - " + app.firstLast2("trust"));
        System.out.println(" The first and last of happiness are same - " + app.firstLast2("happiness"));

        System.out.println();
        System.out.println(" Test sameLength2 method");
        System.out.println(" ======================");
        System.out.println(" Courage and cowards are same length - " + app.sameLength2("courage", "cowards"));
        System.out.println(" Valor and bravery are same length - " + app.sameLength2("valor", "bravery"));
        System.out.println();



     }
}