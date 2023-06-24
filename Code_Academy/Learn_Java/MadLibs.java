public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Santiago Sainz
  Date: Jun/19/2023
  */
    public static void main(String[] args){

      //Name of the Protagonist
      String name1 = " Annie ";

      //Three adjectives that describe my Protagonist 
      String adjective1 = " Sweet ";
      String adjective2 = " Caring ";
      String adjective3 = " Loving ";

      //One Verb for my Potagonist
      String verb1 = "Drawing";

      //6 nouns
      String noun1 = "Cat";
      String noun2 = "Dog";
      String noun3 = "Moon";
      String noun4 = "Flower";
      String noun5 = "Sun";
      String noun6 = "La playa";

      // Freak
      int number = 2021;

      // Another Character enters the story
      String name2 = "Santiago";

      // Another Character enters the story
      String place1 = "Orengon";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);

    }       
}



