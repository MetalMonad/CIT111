/**
 * This program will determine if one would be a compatible friend to me
 * @author Rob Lang
 */

import java.util.Scanner;

public class SPRING21_BeRobsFriend {
    public static void main(String[] args){
        
//      Variables
        int compatScore = 0;
        int userInt;
        int bonusPoints;
        String userLine;
        final int COMPAT_THRESH = 80;
        Scanner inputScanner;
        boolean passedFThresh = false;
        inputScanner = new Scanner(System.in);
        
//      Question 1 - Video games
        System.out.println("Welcome user! Lets be friends!");
        System.out.println("Question 1: Do you play video games? press 1 for yes, or another number for no.");
        userInt = inputScanner.nextInt();
        if(userInt == 1){
            compatScore = compatScore + 30;
            System.out.println("I like you already!");
            System.out.println("You gained 30 points for a total of: " + compatScore);
            System.out.println("");
        } else {
            System.out.println("Alright, maybe they just aren't you're thing");
            System.out.println("You gained 0 points for a total of: " + compatScore);
            System.out.println("");
        }
        
//      Question 2 - Dogs or Cats
        System.out.println("Question 2: Do you like 'Dogs' or 'Cats' more?");
        userLine = inputScanner.next();
//      if statement that checks for either dogs or cats regardless if they capitalize first letter or not
        if(userLine.equals("Dogs") || userLine.equals("dogs")){
           compatScore = compatScore + 40;
           System.out.println("Dogs are the best creature on this entire planet!");
           System.out.println("You gained 40 points for a total of: " + compatScore);
           System.out.println("");
       } else if(userLine.equals("Cats") || userLine.equals("cats")){
           compatScore = compatScore + 20;
           System.out.println("Cats are preetty great, but I'm more of a dog person myself");
           System.out.println("You gaianed 20 points for a total of: " + compatScore);
           System.out.println("");
       } else {
           System.out.println("Thats not one of the animals I asked about... Lets just move on");
           System.out.println("");
       }
        
//      Question 3 - Music tastes
        System.out.println("Question 3: What kind of music do you like the most? Enter the number next to the genre");
        System.out.println("1: Rock");
        System.out.println("2. Metal");
        System.out.println("3. Coutnry");
        System.out.println("4. Hip Hop");
        System.out.println("5: Rap");
        System.out.println("6. Opera/Symphonic/Classical");
        System.out.println("7. Oldies/Soft Rock/Classic Rock");
        System.out.println("8. Pop/EDM");
        System.out.println("9. Other)");
        userInt = inputScanner.nextInt();
        
//      Switch for Music  
        switch(userInt){
                case 1: // Rock
                    compatScore = compatScore + 30;
                    System.out.println("Hey thats my favorite too! On a scale of 1 to 10, how hard do you like your rock?");
//                  I got to see how hard they like their rock \,,/,
                    userInt = inputScanner.nextInt();
                    bonusPoints = userInt * 2;
                    compatScore = compatScore + bonusPoints;
                    System.out.println("The harder the better! You gained 30 points and " + bonusPoints + " bonus points for a total of: " + compatScore); 
//                  Will go into to case 2 based off if they are into metal, else it will do a break and run as normal
                    System.out.println("Are you into metal as well? Yes or no?");                    
                    userLine = inputScanner.next();
                    if(userLine.equals("No") || userLine.equals("no")){
                        System.out.println("Ok fair, it is not everyone's jam");
                        System.out.println("");
                        break;
                    } else if(userLine.equals("Yes") || userLine.equals("yes")){
                        
                    }
                case 2: // Metal
                    compatScore = compatScore + 20;
                    System.out.println("Nice! A fellow metalhhead! Do you like your metal screamo? Yes or No?");
                    userLine = inputScanner.next();
                    if(userLine.equals("Yes") || userLine.equals("yes")){
                        System.out.println("Really? Dang I don't know how you can understand what they are even saying");
                        System.out.println("You gaianed 20 points for a total of: " + compatScore);
                        System.out.println("");
                    }else if(userLine.equals("No") || userLine.equals("no")){
                        compatScore = compatScore + 10;
                        System.out.println("Same here, I like to be able to understand the lyrics, although some screamo is fine I guess");
                        System.out.println("You gained 20 points and 10 bonus points for a total of: " + compatScore);
                        System.out.println("");
                        }         
                    break;
                case 3: // Country
                    compatScore = compatScore - 50; 
                    System.out.println("Ew. You ccan go ride your tractor away from me now"); // Sorry but country is awful
                    System.out.println("You lost 50 points for a total of: " + compatScore);
                    System.out.println("");
                    break;
                case 4: // Hip Hop
                    compatScore = compatScore - 20;
                    System.out.println("Ehh not really my thing sad to say");
                    System.out.println("You lost 20 points for a total of: " + compatScore);
                    System.out.println("");
                    break;
                case 5: // Rap
                    compatScore = compatScore - 30;
                    System.out.println("All the songs sound the same, which is terrible");
                    System.out.println("You lost 30 points for a total of: " + compatScore);
                    System.out.println("");
                    break;
                case 6: // Opera/Symphonic/Classical
                    compatScore = compatScore + 15;
                    System.out.println("I enjoy listening to a few songs, although most are soundtracks from video games and not famous composers haha");
                    System.out.println("You gained 15 points for a total of: " + compatScore);
                    System.out.println("");
                    break;
                case 7: // Oldies/Soft rock/Classic rock
                    compatScore = compatScore - 5;
                    System.out.println("I'm sorry but that is the most boring and mind numbing music in my opinion.");
                    System.out.println("You lost 5 points for a total of: " + compatScore);
                    System.out.println("");
                    break;
                case 8: // Pop/EDM
                    compatScore = compatScore - 15;
                    System.out.println("The music of this generation is really bad");
                    System.out.println("You lost 15 points for a total of: " + compatScore);
                    System.out.println("");
                    break;
                case 9: // Other
                    System.out.println("Not even sure what kind of music I could be forgetting but you should show me");
                    System.out.println("You gained 0 points for a total of: " + compatScore);
                    System.out.println("");
                    break;
                default: // Default
                    System.out.println("Doesn't seem like you entered a correct response");
                    System.out.println("");
                }
        
        //Question 4 - Coolest fantasy archetype
        System.out.println("Question 4: Are you a fan of the Fantasy genre? Well I sure am! "
                + "What is your favorite kind of fantasy character? Enter the corresponding number for your choice");
        System.out.println("1. Knight/Warrior/Barbarian");
        System.out.println("2. Samurai");
        System.out.println("3. Pirate");
        System.out.println("4. Wizard/Warlock");
        System.out.println("5. Ninja");
        System.out.println("6. Zombie");
        System.out.println("7. Dragon");
        userInt = inputScanner.nextInt();
        
        switch(userInt){
            case 1: // Knights/Warriors/Barbarians
                compatScore = compatScore + 30;
                System.out.println("Mine too! I'm a sucker for a fantasy character with a big sword and armor");
                System.out.println("You gained 30 points for a total of: " + compatScore);
                System.out.println("");
                break;
            case 2: // Samurai
                compatScore = compatScore + 10;
                System.out.println("I love big swords, but samurais are just... 'okay' if you ask me");
                System.out.println("You gained 10 points for a total of: " + compatScore);
                System.out.println("");
                break;
            case 3: // Pirate
                compatScore = compatScore + 20;
                System.out.println("Pirates are never not cool! How do you hate something thats all about booty, booze, and freedom?");
                System.out.println("You gained 20 points for a total of: " + compatScore);
                System.out.println("");
                break;
            case 4: // Wizard/Warlock
                System.out.println("I don't know what it is, but the wonderful and imagitive world of magic I just find kind of dull");
                System.out.println("You gained 0 points for a total of: " + compatScore);
                System.out.println("");
                break;
            case 5: // Ninja
                compatScore = compatScore - 10;
                System.out.println("Not gonna lie, ninjas are kind of lame if you ask me");
                System.out.println("You lost 10 points for a total of: " + compatScore);
                System.out.println("");
                break;
            case 6: // Zombie
                compatScore = compatScore - 20;
                System.out.println("Ah yes zombies, take anything at all and add zombies and it makes it 100% cooler right? Right? No.");
                System.out.println("You lost 20 points for a total of: " + compatScore);
                System.out.println("");
                break;
            case 7: // Dragon
                compatScore = compatScore + 5;
                System.out.println("Dragons are cool I guess, nothing wrong with them");
                System.out.println("You gained 5 points for a total of: " + compatScore);
                System.out.println("");
                break;
        }
        
        
//      Question 5 - My grade (completely unbiased in friend making decision)
        System.out.println("Question 5: What should the professor give me on this project?");
        userInt = inputScanner.nextInt();
        if(userInt >= 90){
            compatScore = compatScore + userInt;
            System.out.println("Yeah I think so too thank you! I think you are my friend now!");
            System.out.println("You gained + " + userInt + " points for a total of: " + compatScore);
            System.out.println("");
        } else if(userInt >= 80){
            compatScore = compatScore + 10;
            System.out.println("Aww come on, I think I deserve an A for this!");
            System.out.println("You gaine 10 points for a total of: " + compatScore);
            System.out.println("");
        } else{
            compatScore = compatScore - userInt;
            System.out.println("Man my code is great!!! You'll see when the teacher gives me a good grade!!!");
            System.out.println("");
        }
        
        //End of program with results
        System.out.println("Calculating results...");
        if(compatScore >= COMPAT_THRESH){
            passedFThresh = true;
        }
        
        if(passedFThresh){
            System.out.println("You scored " + compatScore + " points, it looks like we are pretty compatable as friends!");
        } else {
            System.out.println("You scored " + compatScore + " points, we do not appear to be very compatable as friends sadly");
        }
    }
}
