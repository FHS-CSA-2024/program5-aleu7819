//import stuff here?

//Your code here

public class Program5
{public static void main (String[] args) {

// import data
int royaleMile=286;
int royaleGallon=9;
double royaleMpg= 0.0;

int koopaMile=412;
int koopaGallon=40;
double koopaMpg= 0.0;

int pipeMile=361;
int pipeGallon=18;
double pipeMpg=0.0;

int badMile=161;
int badGallon=11;
double badMpg=0.0;

// calculate average mpg (returns a double)
royaleMpg = (double) royaleMile/royaleGallon;
koopaMpg = (double) koopaMile/koopaGallon;
pipeMpg = (double) pipeMile/pipeGallon;
badMpg = (double) badMile/badGallon;

// get rid of decimals (turns into an int + divides it by a double so it returns as a double)
royaleMpg = ((int)((royaleMpg*10)+0.5))/10.0;
koopaMpg = ((int)((koopaMpg*10)+0.5))/10.0;
pipeMpg = ((int)((pipeMpg*10)+0.5))/10.0;
badMpg = ((int)((badMpg*10)+0.5))/10.0;

//print average out
    
    System.out.println("mushroom cup prix racer average mpg: ");
    System.out.println("Royale averaged " + royaleMpg + "m/g");
      System.out.println("Koopa King averaged " + koopaMpg + "m/g");
      System.out.println("Pipe Frame averaged " + pipeMpg + "m/g");
        System.out.println("Badwagon averaged " + badMpg + "m/g");
}}
//Paste console output below:
/*
mushroom cup prix racer average mpg: 
Royale averaged 31.8m/g
Koopa King averaged 10.3m/g
Pipe Frame averaged 20.1m/g
Badwagon averaged 14.6m/g
*/
