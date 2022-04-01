package com.lti.enumex;
/*
 * ENUM: a type that can only have a finite set of values. 
 * An enumeration is like a fixed set of constants. 
 * In Java, an enum is a class that represents an enumeration. 
 * It is much better than a bunch of constants because it provides typeâ€�safe checking. 
 * With numeric constants, you can pass an invalid value and not find out until runtime. 
 * With enums, it is impossible to create an invalid enum type without introducing a compiler error.
 */

//enums can't be extended
//enum ExtendedSeason extends Seasons {}

//enums can't be implemented like interfaces
//enum ImplemetedSeason implements Seasons {}

enum Seasons {
    WINTER, SPRING, SUMMER, FALL  // fixed set of constants 
}

public class Demo1_JavaSimpleEnums {

    public static void main(String[] args) {
    	
        Seasons s = Seasons.WINTER;     
        
        //System.out.println( s == "WINTER" ); // Incompatible operand types Season and String
        System.out.println( s ); // WINTER
        System.out.println( s == Seasons.WINTER ); // true
        
        // values(), name() and ordinal()-position 
        for( Seasons ssn : Seasons.values() ) {
        	
            System.out.println( ssn.name() + " " + ssn.ordinal() );
        }

        // Enums in switch
        Seasons summer = Seasons.SUMMER;
        
        

       // switch( summer.ordinal() ) {
        switch( summer) {
        
       case WINTER:
              System.out.println("Its Winter");
              break;
            case SUMMER:
                System.out.println("Its summer");
                break;
            // DOES NOT COMPILE
          //case Season.SUMMER:
             //    System.out.println("Its Summer");
          //   break;

            // DOES NOT COMPILE
                
     /*    case 1: 
            System.out.println("Its Winter");
           break;
         case 2: 
              System.out.println("Its Spring");
             break;*/
        
            default:
                break;
        }
        

        // can't compare with intger
        /*   if( Seasons.SPRING == 1 ) {
               System.out.println("SPRING is 1");
            }
   */
           System.out.println( Seasons.valueOf("WINTER") ); // WINTER
         //  System.out.println( Seasons.valueOf("winter") ); // Exception:  No enum constant advanced.Season.winter


            
    }
    
    
}
