import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class MadlibProject
{
   
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to my Mad Lib game");
      System.out.println("Enter a number from 1 to 5");
      int selection = scan.nextInt();
      
      if (selection == 1)
      {
         samplePoem();
      
      }
      
      else if (selection == 2)
      {
         article1();
      }
      else if (selection == 3)
      {
         story1();
      }
      else if (selection == 4)
      {
         article2();
      }
      else if (selection == 5)
      {
         story2();
      }
      else
      {
         System.out.println("You have entered an invalid selection. Exiting...");
      }
   }
   
   /*
   *  These methods will implement the specific passages to be mad-libbed
   */
   public static void samplePoem()
   {
      //We will write this poem out. 
      String color;
      String pluralNoun;
      String celebrity;
      Scanner userInput = new Scanner (System.in);
      
      System.out.print ("Enter a color ");
      color = userInput.nextLine();
      
      
      System.out.print ("Enter a pluralNoun ");
      pluralNoun = userInput.nextLine();
      
      System.out.print ("Enter a celebrity ");
      celebrity = userInput.nextLine();
      
      String line1 = ("Roses are " + color+" ");
      String line2 = (pluralNoun + " are blue ");
      String line3= ("I love " + celebrity+ " " );
      String line4 = ("And so should you!");
      
      System.out.println(line1);
      System.out.println(line2);
      System.out.println(line3);
      System.out.println(line4);
      String pathToSaveFile = "poem.txt";
      try 
      {
         FileWriter poet = new FileWriter (pathToSaveFile);
         poet.write(line1);
         poet.write(line2);
         poet.write(line3);
         poet.write(line4);
         poet.close();
      }
      catch(Exception e)
      {
         System.out.println("Couldn't save to " + pathToSaveFile);
      }
      
   }
   public static void article1()
   {
      //Write your code here for article 1
      String size1;
      String number1;
      String number2;
      String emotion1;
      String sense1;
      String months1;
      String job1;
      String number3;
      String season1;
      
      
      Scanner userInput = new Scanner (System.in);
      
      System.out.print ("Enter a size ");
       size1= userInput.nextLine();
       
        System.out.print ("Enter a number 1-20 ");
       number1= userInput.nextLine();
       
        System.out.print ("Enter a number 1-10 ");
       number2= userInput.nextLine();
       
        System.out.print ("Enter an emotion ending in -ly ");
       emotion1 = userInput.nextLine();
       
        System.out.print ("Enter one of the 5 sense ");
       sense1= userInput.nextLine();
       
       System.out.print ("Enter a number 1-6 ");
       months1= userInput.nextLine();
       
       System.out.print ("Enter a service job ");
       job1= userInput.nextLine();
       
       System.out.print ("Enter a number 1-100 ");
       number3= userInput.nextLine();
       
       System.out.print ("Enter a season ");
       season1= userInput.nextLine();
       
       
       String line1= ("Recently there has been a"+size1+" spike of cases for Covid- "+number1+". ");
       String line2= ("Due to this spike, many people have had to social distance "+number2+" feet apart. This has caused schools to shut down and "+emotion1+ " close." );
       String line3= ("Many students have struggled in school because they can not "+sense1+" their teachers face to face. Over the "+months1+" month period, cases have gone down and the spike plateaued.");
       String line4= ("Some schools are even coming back on campus. Covid has also caused many people to lose their jobs, especially "+job1+" workers. The unemployment level has gone up to"+number3+" percent." );
       String line5= ("Hopefully as "+season1+" arrives, Covid s impact will lessen.");
       
       System.out.print (line1);
       System.out.println(line2);
       System.out.println(line3);
       System.out.println(line4);
       System.out.println(line5);

      String pathToSaveFile = "article1.txt";
      try 
      {
         FileWriter author = new FileWriter (pathToSaveFile);
         author.write(line1);
         author.write(line2);
         author.write(line3);
         author.write(line4);
         author.write(line5);
         author.close();
      }
      catch(Exception e)
      {
         System.out.println("Couldn't save to " + pathToSaveFile);
      }
      


     
   }
   
   public static void article2()
   {
      //Write your code for the 2nd article here. 
   String planet1;
   String number1;
   String water1;
   String animal1;
   String plant1;
   String raises1;
   String element1;
   String percent1;
   String percent2;
   String adjective1;
   String water2;
   String less1;
   
   
   Scanner userInput = new Scanner (System.in);
      
      System.out.print ("Enter a planet ");
       planet1= userInput.nextLine();
       
       System.out.print ("Enter a number between 2-10000 ");
       number1= userInput.nextLine();
       
       System.out.print ("Enter a state of water ");
       water1= userInput.nextLine();
       
       System.out.print ("Enter an animal ");
       animal1= userInput.nextLine();
       
       System.out.print ("Enter a type of plant ");
       plant1= userInput.nextLine();
       
       System.out.print ("Enter 'raises' or 'lowers' ");
       raises1= userInput.nextLine();
    
      System.out.print ("Enter an element of the periodic table ");
       element1= userInput.nextLine();
       
       System.out.print ("Enter a number between 50-100 ");
       percent1= userInput.nextLine();
       
       System.out.print ("Enter a number between 1-49 ");
       percent2= userInput.nextLine();
       
       System.out.print ("Enter a adjective ");
       adjective1= userInput.nextLine();
       
       System.out.print ("Enter a state of water ");
      water2 = userInput.nextLine();
       
      System.out.print ("Enter a 'less' or 'more' ");
       less1= userInput.nextLine();
      
  
       
       String line1 = ("Global warming is a very serious issue affecting "+planet1 +" more and more every day. " );
       String line2= ("Due to the past "+number1 +" years of not being educated, people do not understand the issue at hand. "+water1 +" is melting at the poles causing "+animal1+" to be left without homes. ");
       String line3 = ("Many "+plant1 +" have burned down due to forest fires. When plants die, that "+ raises1+" our "+element1 +" levels from "+percent1 +" percent to "+percent2 +" percent. "); 
       String line4= ("As people of this planet, we can do many things to help solve this "+adjective1 +" issue. " );
       String line5= ("Saving "+water2 +", turning off lights and using "+less1 +" eco-friendly products will help reverse the damage global warming has caused.");

   System.out.print(line1);
   System.out.println(line2);
   System.out.println(line3);
   System.out.println(line4);
   System.out.println(line5);


      String pathToSaveFile = "article2.txt";
      try 
      {
         FileWriter author = new FileWriter (pathToSaveFile);
         author.write(line1);
         author.write(line2);
         author.write(line3);
         author.write(line4);
         author.write(line5);
         author.close();
      }
      catch(Exception e)
      {
         System.out.println("Couldn't save to " + pathToSaveFile);
      }
      
   }
   
   public static void story1()
   {
      //Write your code for short story 1 here
      String adjective1;
      String room1;
      String food1;
      String name1;
      String country1;
      String emotion1;
      String sightToSee1;
      String time1;
      String miles1;
      String adjective3;
      String clothing1;
      String verb1;
      String number2;
      String adjective4;
      String AM1;
      String color1;
      String number3;
      String food2;
      String adjective5;
      
      Scanner userInput = new Scanner (System.in);
      
      System.out.print ("Enter an adjective ");
      adjective1 = userInput.nextLine();
      
      System.out.print ("Enter a room in a house ");
      room1= userInput.nextLine();
      
      System.out.print ("Enter a food item ");
      food1 = userInput.nextLine();
      
      System.out.print ("Enter a name ");
      name1 = userInput.nextLine();
      
      System.out.print ("Enter a country ");
      country1 = userInput.nextLine();
      
      System.out.print ("Enter a emotion ");
      emotion1= userInput.nextLine();
      
      System.out.print ("Enter a sight to see ");
      sightToSee1 = userInput.nextLine();
      
      System.out.print ("Enter a number from 1-12 ");
      time1 = userInput.nextLine();
      
      System.out.print ("Enter a number between 12-27 ");
      miles1 = userInput.nextLine();
      
      System.out.print ("Enter a adjective ");
      adjective3 = userInput.nextLine();
      
      System.out.print ("Enter a article of clothing  ");
      clothing1 = userInput.nextLine();
      
      System.out.print ("Enter a verb ending in -ing ");
      verb1 = userInput.nextLine();
      
      System.out.print ("Enter a number 1-1000 ");
      number2 = userInput.nextLine();
      
      System.out.print ("Enter a adjective ");
      adjective4 = userInput.nextLine();
      
      System.out.print ("Enter AM or PM ");
      AM1 = userInput.nextLine();
      
      System.out.print ("Enter a color ");
      color1 = userInput.nextLine();
      
      System.out.print ("Enter a number between 12-27 ");
      number3 = userInput.nextLine();
      
      System.out.print ("Enter a food item ");
      food2 = userInput.nextLine();
      
      System.out.print ("Enter a adjective ");
      adjective5 = userInput.nextLine();
            
      String line1 = ("There once was a(n) "+adjective1+ " sad princess. She always cried in her" +room1+".");
      String line2 = (" To comfort herself, the princess ate a lot of "+food1+ ". One day, their friend Miss" +name1+ " invited them on a trip!" ); 
      String line3 = ("They were going to "+country1+". \"It will be so much fun!\" her friend said. The princess was "+emotion1+", she loved going on trips.");
      String line4 = ("She was most excited to see the "+sightToSee1+" and sights the trip will show. They woke up bright and early at exactly " +time1+" AM." );
      String line5= ("The princesses' friend drove them" +miles1+" miles to the airport.The princess wore "+adjective3+ " " +clothing1+" and bright pink shoes. When they landed they went straight to the hotel.");
      String line6= ("They loved "+verb1+" and decided to walk down the street to do just that. After a long day they walked "+number2+" miles to their "+adjective4+" room.");
      String line7= ("They both fell asleep and woke up at 8:30 "+AM1+". They were almost late to their flight! They ran to their "+color1+" car and hurried to the airport. There was a line "+number3+" miles long!");
      String line8= ("They were going to miss their flight! They cut corners and were able to make it right on time. They flew home and made it back just in time for their favorite dinner,"+food2+". The princess and her friend had a(n)"+adjective5+" time.");
      
      System.out.print (line1);
      System.out.println (line2);
      System.out.println (line3);
      System.out.println (line4);
      System.out.println (line5);
      System.out.println (line6);
      System.out.println (line7);
      System.out.println (line8);
      

      String pathToSaveFile = "story1.txt";
      try 
      {
         FileWriter author = new FileWriter (pathToSaveFile);
         author.write(line1);
         author.write(line2);
         author.write(line3);
         author.write(line4);
         author.write(line5);
         author.write(line6);
         author.write(line7);
         author.write(line8);
         author.close();
      }
      catch(Exception e)
      {
         System.out.println("Couldn't save to " + pathToSaveFile);
      }

      
   }
   
   public static void story2()
   {
      String age1;
      String person1;
      String theme1;
      String adjective1;
      String color1;
      String adjective2;
      String color2;
      String time1;
      String resturant1;
      String food1;
      String color3;
      String shape1;
      String number1;
      String adverb1;
      String celebrity1;
      
      Scanner userInput = new Scanner (System.in);
      
      System.out.print ("Enter a number 13-20 ");
      age1= userInput.nextLine();
      
      System.out.print ("Enter a person's name ");
      person1= userInput.nextLine();
      
      System.out.print ("Enter a party theme ");
      theme1= userInput.nextLine();
      
      System.out.print ("Enter an adjective ");
      adjective1 = userInput.nextLine();
      
      System.out.print ("Enter a color ");
      color1= userInput.nextLine();
      
      System.out.print ("Enter an adjective ");
      adjective2= userInput.nextLine();
      
      System.out.print ("Enter a color ");
      color2= userInput.nextLine();
      
      System.out.print ("Enter a number 1-12 ");
      time1= userInput.nextLine();
      
      System.out.print ("Enter a resturant ");
      resturant1= userInput.nextLine();
      
      System.out.print ("Enter a food item ");
      food1= userInput.nextLine();
      
      System.out.print ("Enter a color ");
      color3= userInput.nextLine();
      
      System.out.print ("Enter a plural shape ");
      shape1= userInput.nextLine();
      
      System.out.print ("Enter a number 1-5 ");
      number1= userInput.nextLine();
      
      System.out.print ("Enter an adverb ending in -ly ");
      adverb1= userInput.nextLine();
      
      System.out.print ("Enter a celebrity ");
      celebrity1= userInput.nextLine();
      
      String line1= ("Today I'm hosting my " +age1+ "th birthday party. Everyone is invited even " +person1+ ".");
      String line2= ("The theme is " +theme1 +". The balloons will be "+adjective1+ " and " +color1+ " and the cake will be " +adjective2+ " .");
      String line3= ("Even my best friend helped me hang " +color2+ " streamers everywhere. Everyone is coming at exactly " +time1+ " o clock." ); 
      String line4= ("The plan is to first go to " +resturant1+ " . I just love their " +food1+ " and want to get some for the party. Next we will pick up the cake." );
      String line5= ("The cake will be a bright " +color3+" and have" + shape1+ " all over it. It will be exactly " +number1+ " tiers tall! Lastly, we will pick up all my friends and " +adverb1+" drive home.");
      String line6= ("I am so excited for the party! Hopefully " +celebrity1+ " can come too.");
      System.out.print (line1);
      System.out.println (line2);
      System.out.println (line3);
      System.out.println (line4);
      System.out.println (line5);
      System.out.println (line6);

      
      
      String pathToSaveFile = "story2.txt";
      try 
      {
         FileWriter author = new FileWriter (pathToSaveFile);
         author.write(line1);
         author.write(line2);
         author.write(line3);
         author.write(line4);
         author.write(line5);
         author.write(line6);

         author.close();
      }
      catch(Exception e)
      {
         System.out.println("Couldn't save to " + pathToSaveFile);
      }
      
   }
   
   
}