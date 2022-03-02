import java.util.Scanner;

public class Election {
public static void main (String[] args)
{
    int votesForPolly; // number of votes for Polly in each precinct
int votesForErnest; // number of votes for Ernest in each precinct
int totalPolly; // running total of votes for Polly
int totalErnest; // running total of votes for Ernest
String response; // answer (y or n) to the "more precincts" question

Scanner scan = new Scanner(System.in);

System.out.println ();
System.out.println ("Election Day Vote Counting Program");
System.out.println ();
// Initializations

// Loop to "process" the votes in each precinct
    {
    System.out.println ("Enter Votes? Enter Y or N");
    response=scan.next().toUpperCase();
    if (response.equals("Y"))
    {       
        response="Yes";
        System.out.println ("Enter votes for Polly:");
        votesForPolly=scan.nextInt();
        totalPolly=totalPolly+ votesForPolly;
        System.out.println ("Enter votes for Ernest:");
        votesForErnest=scan.nextInt();
        totalErnest=totalErnest+ votesForErnest;}
        System.out.println ("Enter another District? Enter Y or N");
        response=scan.next().toUpperCase(); }
    else


    { 
    response=0

while (response =1)
}
// Print out the results
System.out.println ("Total votes for Polly is: " + totalPolly);
System.out.println ("Total votes for Ernest is: " + totalErnest);
}
}