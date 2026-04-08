package lab5;

import java.util.Random;

public class Lab05Q2 {
    public static void main(String[] args) {
         String player1Route2 = "";
        String player1Route3 = "";
        String player1Route4 = "";
        String player1Route5 = "";
        String player1Route6 = "";
        String player2Route2 = "";
        String player2Route3 = "";
        String player2Route4 = "";
        String player2Route5 = "";
        String player2Route6 = "";
        String player3Route2 = "";
        String player3Route3 = "";
        String player3Route4 = "";
        String player3Route5 = "";
        String player3Route6 = "";

        boolean player1Route2Completed = false;
        boolean player1Route3Completed = false;
        boolean player1Route4Completed = false;
        boolean player1Route5Completed = false;
        boolean player1Route6Completed = false;

        boolean player2Route2Completed = false;
        boolean player2Route3Completed = false;
        boolean player2Route4Completed = false;
        boolean player2Route5Completed = false;
        boolean player2Route6Completed = false;

        boolean player3Route2Completed = false;
        boolean player3Route3Completed = false;
        boolean player3Route4Completed = false;
        boolean player3Route5Completed = false;
        boolean player3Route6Completed = false;

        int roundNumber = 1;
        int player1Point = 0;
        int player2Point = 0;
        int player3Point = 0;
        int deck1Length = 5;
        int deck2Length = 5;
        int deck3Length = 5;
        int numberOf_R_1Deck= 0;
        int numberOf_R_2Deck= 0;
        int numberOf_R_3Deck= 0;

        int numberOf_G_1Deck= 0;
        int numberOf_G_2Deck= 0;
        int numberOf_G_3Deck= 0;

        int numberOf_M_1Deck= 0;
        int numberOf_M_2Deck= 0;
        int numberOf_M_3Deck= 0;

        int numberOf_B_1Deck= 0;
        int numberOf_B_2Deck= 0;
        int numberOf_B_3Deck= 0;

        int numberOf_Y_1Deck= 0;
        int numberOf_Y_2Deck= 0;
        int numberOf_Y_3Deck= 0;

        

        String colors = "RGBMY";
        String deck = "";
        for(int i=0; i<25; i++)
        {
            deck = (deck.concat(colors));
        }
        System.out.println(deck);

        Random r = new Random();
        
        for (int i = 1; i < 125; i ++)
        {  
            int randomInt = r.nextInt(i);
            String s2 = deck.substring(i,i+1);
            String s3 = deck.substring(randomInt,randomInt+1);
            deck = deck.substring(0,randomInt) + s2 + deck.substring(randomInt+1,i) + s3 + deck.substring(i+1);

        }
            System.out.println(deck);
            String Player1deck = deck.substring(0, 5);
            String Player2deck = deck.substring(5, 10);
            String Player3deck = deck.substring(10, 15);
            System.out.println(Player1deck);
            System.out.println(Player2deck);
            System.out.println(Player3deck);
            deck  = deck.substring(15 );
            deck1Length = Player1deck.length();
            deck2Length = Player2deck.length();
            deck3Length = Player3deck.length();

            

            while(player1Point < 20 && player2Point < 20 && player3Point < 20)
            {
                deck1Length = Player1deck.length();
                deck2Length = Player2deck.length();
                deck3Length = Player3deck.length();

                for (int i = 0; i < deck1Length; i++) 
            {
                if (Player1deck.charAt(i) == 'R') 
                {
                    numberOf_R_1Deck ++;
                 
                } 
            }   
            for (int i = 0; i < deck1Length; i++) 
            {
                if (Player1deck.charAt(i) == 'G') 
                {
                    numberOf_G_1Deck ++;
                 
                } 
            }   
            for (int i = 0; i < deck1Length; i++) 
            {
                if (Player1deck.charAt(i) == 'B') 
                {
                    numberOf_B_1Deck ++;
                 
                } 
            }  
            for (int i = 0; i < deck1Length; i++) 
            {
                if (Player1deck.charAt(i) == 'M') 
                {
                    numberOf_M_1Deck ++;
                 
                } 
            } 
            for (int i = 0; i < deck1Length; i++) 
            {
                if (Player1deck.charAt(i) == 'Y') 
                {
                    numberOf_Y_1Deck ++;
                 
                } 
            }
           
            for (int i = 0; i < deck2Length; i++) 
            {
                if (Player2deck.charAt(i) == 'R') 
                {
                    numberOf_R_2Deck ++;
                 
                } 
            }   
            for (int i = 0; i < deck2Length; i++) 
            {
                if (Player2deck.charAt(i) == 'G') 
                {
                    numberOf_G_2Deck ++;
                 
                } 
            }   
            for (int i = 0; i < deck2Length; i++) 
            {
                if (Player2deck.charAt(i) == 'B') 
                {
                    numberOf_B_2Deck ++;
                 
                } 
            }  
            for (int i = 0; i < deck2Length; i++) 
            {
                if (Player2deck.charAt(i) == 'M') 
                {
                    numberOf_M_2Deck ++;
                 
                } 
            } 
            for (int i = 0; i < deck2Length; i++) 
            {
                if (Player2deck.charAt(i) == 'Y') 
                {
                    numberOf_Y_2Deck ++;
                 
                } 
            }

                 
                
                    
                 

            
            for (int i = 0; i < deck3Length; i++) 
            {
                if (Player3deck.charAt(i) == 'R') 
                {
                    numberOf_R_3Deck ++;
                 
                } 
            }   
            for (int i = 0; i < deck3Length; i++) 
            {
                if (Player3deck.charAt(i) == 'G') 
                {
                    numberOf_G_3Deck ++;
                 
                } 
            }   
            for (int i = 0; i < deck3Length; i++) 
            {
                if (Player3deck.charAt(i) == 'B') 
                {
                    numberOf_B_3Deck ++;
                 
                } 
            }  
            for (int i = 0; i < deck3Length; i++) 
            {
                if (Player3deck.charAt(i) == 'M') 
                {
                    numberOf_M_3Deck ++;
                 
                } 
            } 
            for (int i = 0; i < deck3Length; i++) 
            {
                if (Player3deck.charAt(i) == 'Y') 
                {
                    numberOf_Y_3Deck ++;
                 
                } 
            } 
            
                System.out.println("");
                System.out.println("###### Game round # " + roundNumber);
                roundNumber ++;

                //PLAYER 1TURN
                System.out.println("");
                System.out.println("## Player1 ##");
                System.out.println("Previous Hand: " + Player1deck);

                if(numberOf_B_1Deck >= 6 && !player1Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("B","");
                    }
                    player1Point = player1Point + 6;
                    System.out.println("R6");
                    player1Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route6 = "BBBBBB";
                    numberOf_B_1Deck -=6;
                }
                else if(numberOf_G_1Deck >= 6 && !player1Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("G","");
                    }
                    player1Point = player1Point + 6;
                    System.out.println("R6");
                    player1Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route6 = "GGGGGG";
                    numberOf_G_1Deck -=6;
                }
                else if(numberOf_Y_1Deck >= 6 && !player1Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("Y","");
                    }
                    player1Point = player1Point + 6;
                    System.out.println("R6");
                    player1Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route6 = "YYYYYY";
                    numberOf_Y_1Deck -=6;
                }
                else if(numberOf_M_1Deck  >= 6 && !player1Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("M","");
                    }
                    player1Point = player1Point + 6;
                    System.out.println("R6");
                    player1Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route6 = "MMMMMM";
                    numberOf_M_1Deck -=6;
                }
                else if(numberOf_R_1Deck  >= 6 && !player1Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("R","");
                    }
                    player1Point = player1Point + 6;
                    System.out.println("R6");
                    player1Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route6 = "RRRRRR";
                    numberOf_R_1Deck -=6;
                }
                else if(numberOf_B_1Deck  >= 5 && !player1Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("B","");
                    }
                    player1Point = player1Point + 5;
                    System.out.println("R5");
                    player1Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route5 = "BBBBB";
                    numberOf_B_1Deck -=5;
                }
                else if(numberOf_G_1Deck  >= 5 && !player1Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("G","");
                    }
                    player1Point = player1Point + 5;
                    System.out.println("R5");
                    player1Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route5 = "GGGGG";
                    numberOf_G_1Deck -=5;
                }
                else if(numberOf_Y_1Deck  >= 5 && !player1Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("Y","");
                    }
                    player1Point = player1Point + 5;
                    System.out.println("R5");
                    player1Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route5 = "YYYYY";
                    numberOf_Y_1Deck-=5;
                }
                else if(numberOf_M_1Deck  >= 5 && !player1Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("M","");
                    }
                    player1Point = player1Point + 5;
                    System.out.println("R5");
                    player1Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route5 = "MMMMM";
                    numberOf_M_1Deck -=5;
                }
                else if(numberOf_R_1Deck  >= 5 && !player1Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("R","");
                    }
                    player1Point = player1Point + 5;
                    System.out.println("R5");
                    player1Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route5 = "RRRRR";
                    numberOf_R_1Deck -=5;
                }
                else if(numberOf_B_1Deck >= 4 && !player1Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("B","");
                    }
                    player1Point = player1Point + 4;
                    System.out.println("R4");
                    player1Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route4 = "BBBB";
                    numberOf_B_1Deck -=4;
                }
                else if(numberOf_G_1Deck  >= 4 && !player1Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("G","");
                    }
                    player1Point = player1Point + 4;
                    System.out.println("R4");
                    player1Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route4 = "GGGG";
                    numberOf_G_1Deck -=4;
                }
                else if(numberOf_Y_1Deck  >= 4 && !player1Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("Y","");
                    }
                    player1Point = player1Point + 4;
                    System.out.println("R4");
                    player1Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route4 = "YYYY";
                    numberOf_Y_1Deck -=4;
                }
                else if(numberOf_M_1Deck  >= 4 && !player1Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("M","");
                    }
                    player1Point = player1Point + 4;
                    System.out.println("R4");
                    player1Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route4 = "MMMM";
                    numberOf_M_1Deck -=4;
                }
                else if(numberOf_R_1Deck  >= 4 && !player1Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("R","");
                    }
                    player1Point = player1Point + 4;
                    System.out.println("R4");
                    player1Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route4 = "RRRR";
                    numberOf_R_1Deck -=4;
                }
                else if(numberOf_B_1Deck  >= 3 && !player1Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("B","");
                    }
                    player1Point = player1Point + 3;
                    System.out.println("R3");
                    player1Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route3 = "BBB";
                    numberOf_B_1Deck -=3;
                }
                else if(numberOf_G_1Deck  >= 3 && !player1Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("G","");
                    }
                    player1Point = player1Point + 3;
                    System.out.println("R3");
                    player1Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route3 = "GGG";
                    numberOf_G_1Deck -=3;
                }
                else if(numberOf_Y_1Deck  >= 3 && !player1Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("Y","");
                    }
                    player1Point = player1Point + 3;
                    System.out.println("R3");
                    player1Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route3 = "YYY";
                    numberOf_Y_1Deck -=3;
                }
                else if(numberOf_M_1Deck  >= 3 && !player1Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("M","");
                    }
                    player1Point = player1Point + 3;
                    System.out.println("R3");
                    player1Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route3 = "MMM";
                    numberOf_M_1Deck -=3;
                }
                else if(numberOf_R_1Deck >= 3 && !player1Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("R","");
                    }
                    player1Point = player1Point + 3;
                    System.out.println("R3");
                    player1Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route3 = "RRR";
                    numberOf_R_1Deck-=3;
                }
                else if(numberOf_B_1Deck  >= 2 && !player1Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("B","");
                    }
                    player1Point = player1Point + 2;
                    System.out.println("R2");
                    player1Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route2 = "BB";
                    numberOf_B_1Deck -=2;
                }
                else if(numberOf_G_1Deck  >= 2 && !player1Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("G","");
                    }
                    player1Point = player1Point + 2;
                    System.out.println("R2");
                    player1Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route2 = "GG";
                    numberOf_G_1Deck-=2;
                }
                else if(numberOf_Y_1Deck  >= 2 && !player1Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("Y","");
                    }
                    player1Point = player1Point + 2;
                    System.out.println("R2");
                    player1Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route2 = "YY";
                    numberOf_Y_1Deck -=2;
                }
                else if(numberOf_M_1Deck  >= 2 && !player1Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("M","");
                    }
                    player1Point = player1Point + 2;
                    System.out.println("R2");
                    player1Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route2 = "MM";
                    numberOf_M_1Deck -=2;
                }
                else if(numberOf_R_1Deck  >= 2 && !player1Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player1deck = Player1deck.replaceFirst("R","");
                    }
                    player1Point = player1Point + 2;
                    System.out.println("R2");
                    player1Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player1deck );
                    player1Route2 = "RR";
                    numberOf_R_1Deck -=2;
                }
                else
                {
                    Player1deck = Player1deck + deck.substring(0, 3);
                    deck1Length = deck1Length + 3;
                    System.out.print("Card Drawn: ");
                    System.out.println(deck.substring(0, 3));
                    System.out.println("Current Hand: " + Player1deck );

                    for (int i = 0; i < 3; i++) 
                    {
                    if (deck.substring(0, 3).charAt(i) == 'R') 
                        {
                        numberOf_R_1Deck ++;
                        
                        } 
                    }   
                    for (int i = 0; i < 3; i++) 
                    {
                     if (deck.substring(0, 3).charAt(i) == 'G') 
                        {
                        numberOf_G_1Deck ++;
                        
                        } 
                    }   
                    for (int i = 0; i < 3; i++) 
                    {
                    if (deck.substring(0, 3).charAt(i) == 'B') 
                        {
                        numberOf_B_1Deck ++;
                        
                        } 
                    }  
                    for (int i = 0; i < 3; i++) 
                    {
                        if (deck.substring(0, 3).charAt(i) == 'M') 
                        {
                        numberOf_M_1Deck ++;
                        
                        } 
                    } 
                    for (int i = 0; i < 3; i++) 
                    {
                        if (deck.substring(0, 3).charAt(i) == 'Y') 
                        {
                        numberOf_Y_1Deck ++;
                        
                        } 
                    }
                    deck = deck.substring(3);
                    
                }
                System.out.println("Route#2: " + player1Route2);
                System.out.println("Route#3: " + player1Route3);
                System.out.println("Route#4: " + player1Route4);
                System.out.println("Route#5: " + player1Route5);
                System.out.println("Route#6: " + player1Route6);

                 //PLAYER 2TURN
                 System.out.println("");
                 System.out.println("## Player2 ##");
                 System.out.println("Previous Hand: " + Player2deck);

                if(numberOf_B_2Deck  >= 6 && !player2Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("B","");
                    }
                    player2Point = player2Point + 6;
                    System.out.println("R6");
                    player2Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route6 = "BBBBBB";
                    numberOf_B_2Deck -=6;
                }
                else if(numberOf_G_2Deck  >=6 && !player2Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("G","");
                    }
                    player2Point = player2Point + 6;
                    System.out.println("R6");
                    player2Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route6 = "GGGGGG";
                    numberOf_G_2Deck -=6;
                }
                else if(numberOf_Y_2Deck  >= 6 && !player2Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("Y","");
                    }
                    player2Point = player2Point + 6;
                    System.out.println("R6");
                    player2Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route6 = "YYYYYY";
                    numberOf_Y_2Deck -=6;
                }
                else if(numberOf_M_2Deck  >= 6 && !player2Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("M","");
                    }
                    player2Point = player2Point + 6;
                    System.out.println("R6");
                    player2Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route6 = "MMMMMM";
                    numberOf_M_2Deck -=6;
                }
                else if(numberOf_R_2Deck  >= 6 && !player2Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("R","");
                    }
                    player2Point = player2Point + 6;
                    System.out.println("R6");
                    player2Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route6 = "RRRRRR";
                    numberOf_R_2Deck -=6;
                }
                else if(numberOf_B_2Deck  >= 5 && !player2Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("B","");
                    }
                    player2Point = player2Point + 5;
                    System.out.println("R5");
                    player2Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route5 = "BBBBB";
                    numberOf_B_2Deck -=5;
                }
                else if(numberOf_G_2Deck  >= 5 && !player2Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("G","");
                    }
                    player2Point = player2Point + 5;
                    System.out.println("R5");
                    player2Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route5 = "GGGGG";
                    numberOf_G_2Deck -=5;
                }
                else if(numberOf_Y_2Deck  >= 5 && !player2Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("Y","");
                    }
                    player2Point = player2Point + 5;
                    System.out.println("R5");
                    player2Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route5 = "YYYYY";
                    numberOf_Y_2Deck -=5;
                }
                else if(numberOf_M_2Deck  >= 5 && !player2Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("M","");
                    }
                    player2Point = player2Point + 5;
                    System.out.println("R5");
                    player2Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route5 = "MMMMM";
                    numberOf_M_2Deck -=5;
                }
                else if(numberOf_R_2Deck  >= 5 && !player2Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("R","");
                    }
                    player2Point = player2Point + 5;
                    System.out.println("R5");
                    player2Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route5 = "RRRRR";
                    numberOf_R_2Deck -=5;
                }
                else if(numberOf_B_2Deck  >= 4 && !player2Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("B","");
                    }
                    player2Point = player2Point + 4;
                    System.out.println("R4");
                    player2Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route4 = "BBBB";
                    numberOf_B_2Deck -=4;
                }
                else if(numberOf_G_2Deck  >= 4 && !player2Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("G","");
                    }
                    player2Point = player2Point + 4;
                    System.out.println("R4");
                    player2Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route4 = "GGGG";
                    numberOf_G_2Deck -=4;
                }
                else if(numberOf_Y_2Deck  >= 4 && !player2Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("Y","");
                    }
                    player2Point = player2Point + 4;
                    System.out.println("R4");
                    player2Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route4 = "YYYY";
                    numberOf_Y_2Deck -=4;
                }
                else if(numberOf_M_2Deck  >= 4 && !player2Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("M","");
                    }
                    player2Point = player2Point + 4;
                    System.out.println("R4");
                    player2Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route4 = "MMMM";
                    numberOf_M_2Deck -=4;
                }
                else if(numberOf_R_2Deck  >= 4 && !player2Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("R","");
                    }
                    player2Point = player2Point + 4;
                    System.out.println("R4");
                    player2Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route4 = "RRRR";
                    numberOf_R_2Deck -=4;
                }
                else if(numberOf_B_2Deck  >= 3 && !player2Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("B","");
                    }
                    player2Point = player2Point + 3;
                    System.out.println("R3");
                    player2Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route3 = "BBB";
                    numberOf_B_2Deck -=3;
                }
                else if(numberOf_G_2Deck >= 3 && !player2Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("G","");
                    }
                    player2Point = player2Point + 3;
                    System.out.println("R3");
                    player2Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route3 = "GGG";
                    numberOf_G_2Deck -=3;
                }
                else if(numberOf_Y_2Deck  >= 3 && !player2Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("Y","");
                    }
                    player2Point = player2Point + 3;
                    System.out.println("R3");
                    player2Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route3 = "YYY";
                    numberOf_Y_2Deck -=3;
                }
                else if(numberOf_M_2Deck  >= 3 && !player2Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("M","");
                    }
                    player2Point = player2Point + 3;
                    System.out.println("R3");
                    player2Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route3 = "MMM";
                    numberOf_M_2Deck -=3;
                }
                else if(numberOf_R_2Deck  >= 3 && !player2Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("R","");
                    }
                    player2Point = player2Point + 3;
                    System.out.println("R3");
                    player2Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route3 = "RRR";
                    numberOf_R_2Deck -=3;
                }
                else if(numberOf_B_2Deck  >= 2 && !player2Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("B","");
                    }
                    player2Point = player2Point + 2;
                    System.out.println("R2");
                    player2Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route2 = "BB";
                    numberOf_B_2Deck -=2;
                }
                else if(numberOf_G_2Deck  >= 2 && !player2Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("G","");
                    }
                    player2Point = player2Point + 2;
                    System.out.println("R2");
                    player2Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route2 = "GG";
                    numberOf_G_2Deck -=2;
                }
                else if(numberOf_Y_2Deck  >= 2 && !player2Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("Y","");
                    }
                    player2Point = player2Point + 2;
                    System.out.println("R2");
                    player2Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route2 = "YY";
                    numberOf_Y_2Deck -=2;
                }
                else if(numberOf_M_2Deck  >= 2 && !player2Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("M","");
                    }
                    player2Point = player2Point + 2;
                    System.out.println("R2");
                    player2Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route2 = "MM";
                    numberOf_M_2Deck-=2;
                }
                else if(numberOf_R_2Deck  >= 2 && !player2Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player2deck = Player2deck.replaceFirst("R","");
                    }
                    player2Point = player2Point + 2;
                    System.out.println("R2");
                    player2Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player2deck );
                    player2Route2 = "RR";
                    numberOf_R_2Deck -=2;
                }
                else
                {
                    Player2deck = Player2deck + deck.substring(0, 3);
                    deck2Length = deck2Length + 3;
                    System.out.print("Card Drawn: "); 
                    System.out.println(deck.substring(0, 3));
                    System.out.println("Current Hand: " + Player2deck );

                    for (int i = 0; i < 3; i++) 
            {
                if (deck.substring(0, 3).charAt(i) == 'R') 
                {
                    numberOf_R_2Deck ++;
                 
                } 
            }   
            for (int i = 0; i < 3; i++) 
            {
                if (deck.substring(0, 3).charAt(i) == 'G') 
                {
                    numberOf_G_2Deck ++;
                 
                } 
            }   
            for (int i = 0; i < 3; i++) 
            {
                if (deck.substring(0, 3).charAt(i) == 'B') 
                {
                    numberOf_B_2Deck ++;
                 
                } 
            }  
            for (int i = 0; i < 3; i++) 
            {
                if (deck.substring(0, 3).charAt(i) == 'M') 
                {
                    numberOf_M_2Deck ++;
                 
                } 
            } 
            for (int i = 0; i < 3; i++) 
            {
                if (deck.substring(0, 3).charAt(i) == 'Y') 
                {
                    numberOf_Y_2Deck ++;
                 
                } 
            }
            deck = deck.substring(3);
                    
                }
 
                System.out.println("Route#2: " + player2Route2);
                System.out.println("Route#3: " + player2Route3);
                System.out.println("Route#4: " + player2Route4);
                System.out.println("Route#5: " + player2Route5);
                System.out.println("Route#6: " + player2Route6);

                 //PLAYER 3TURN
                 System.out.println("");
                 System.out.println("## Player3 ##");
                 System.out.println("Previous Hand: " + Player3deck);
                if(numberOf_B_3Deck  >= 6 && !player3Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("B","");
                    }
                    player3Point = player3Point + 6;
                    System.out.println("R6");
                    player3Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route6 = "BBBBBB";
                    numberOf_B_3Deck -=6;
                }
                else if(numberOf_G_3Deck  >= 6 && !player3Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("G","");
                    }
                    player3Point = player3Point + 6;
                    System.out.println("R6");
                    player3Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route6 = "GGGGGG";
                    numberOf_G_3Deck-=6;
                }
                else if(numberOf_Y_3Deck  >= 6 && !player3Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("Y","");
                    }
                    player3Point = player3Point + 6;
                    System.out.println("R6");
                    player3Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route6 = "YYYYYY";
                    numberOf_Y_3Deck -=6;
                }
                else if(numberOf_M_3Deck  >= 6 && !player3Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("M","");
                    }
                    player3Point = player3Point + 6;
                    System.out.println("R6");
                    player3Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route6 = "MMMMMM";
                    numberOf_M_3Deck-=6;
                }
                else if(numberOf_R_3Deck  >= 6 && !player3Route6Completed)
                {
                    for(int i=0; i<6; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("R","");
                    }
                    player3Point = player3Point + 6;
                    System.out.println("R6");
                    player3Route6Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route6 = "RRRRRR";
                    numberOf_R_3Deck -=6;
                }
                else if(numberOf_B_3Deck  >= 5 && !player3Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("B","");
                    }
                    player3Point = player3Point + 5;
                    System.out.println("R5");
                    player3Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route5 = "BBBBB";
                    numberOf_B_3Deck -=5;
                }
                else if(numberOf_G_3Deck  >= 5 && !player3Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("G","");
                    }
                    player3Point = player3Point + 5;
                    System.out.println("R5");
                    player3Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route5 = "GGGGG";
                    numberOf_G_3Deck -=5;
                }
                else if(numberOf_Y_3Deck >= 5 && !player3Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("Y","");
                    }
                    player3Point = player3Point + 5;
                    System.out.println("R5");
                    player3Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route5 = "YYYYY";
                    numberOf_Y_3Deck -=5;
                }
                else if(numberOf_M_3Deck  >= 5 && !player3Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("M","");
                    }
                    player3Point = player3Point + 5;
                    System.out.println("R5");
                    player3Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route5 = "MMMMM";
                    numberOf_M_3Deck -=5;
                }
                else if(numberOf_R_3Deck  >= 5 && !player3Route5Completed)
                {
                    for(int i=0; i<5; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("R","");
                    }
                    player3Point = player3Point + 5;
                    System.out.println("R5");
                    player3Route5Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route5 = "RRRRR";
                    numberOf_R_3Deck -=5;
                }
                else if(numberOf_B_3Deck  >= 4 && !player3Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("B","");
                    }
                    player3Point = player3Point + 4;
                    System.out.println("R4");
                    player3Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route4 = "BBBB";
                    numberOf_B_3Deck -=4;
                }
                else if(numberOf_G_3Deck >= 4 && !player3Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("G","");
                    }
                    player3Point = player3Point + 4;
                    System.out.println("R4");
                    player3Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route4 = "GGGG";
                    numberOf_G_3Deck -=4;
                }
                else if(numberOf_Y_3Deck  >= 4 && !player3Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("Y","");
                    }
                    player3Point = player3Point + 4;
                    System.out.println("R4");
                    player3Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route4 = "YYYY";
                    numberOf_Y_3Deck-=4;
                }
                else if(numberOf_M_3Deck >=4 && !player3Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("M","");
                    }
                    player3Point = player3Point + 4;
                    System.out.println("R4");
                    player3Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route4 = "MMMM";
                    numberOf_M_3Deck -=4;
                }
                else if(numberOf_R_3Deck >=4 && !player3Route4Completed)
                {
                    for(int i=0; i<4; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("R","");
                    }
                    player3Point = player3Point + 4;
                    System.out.println("R4");
                    player3Route4Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route4 = "RRRR";
                    numberOf_R_3Deck -=4;
                }
                else if(numberOf_B_3Deck  >= 3 && !player3Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("B","");
                    }
                    player3Point = player3Point + 3;
                    System.out.println("R3");
                    player3Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route3 = "BBB";
                    numberOf_B_3Deck -=3;
                }
                else if(numberOf_G_3Deck  >= 3 && !player3Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("G","");
                    }
                    player3Point = player3Point + 3;
                    System.out.println("R3");
                    player3Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route3 = "GGG";
                    numberOf_G_3Deck -=3;
                }
                else if(numberOf_Y_3Deck  >= 3 && !player3Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("Y","");
                    }
                    player3Point = player3Point + 3;
                    System.out.println("R3");
                    player3Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route3 = "YYY";
                    numberOf_Y_3Deck -=3;
                }
                else if(numberOf_M_3Deck  >= 3 && !player3Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("M","");
                    }
                    player3Point = player3Point + 3;
                    System.out.println("R3");
                    player3Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route3 = "MMM";
                    numberOf_M_3Deck -=3;
                }
                else if(numberOf_R_3Deck >= 3 && !player3Route3Completed)
                {
                    for(int i=0; i<3; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("R","");
                    }
                    player3Point = player3Point + 3;
                    System.out.println("R3");
                    player3Route3Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route3 = "RRR";
                    numberOf_R_3Deck -=3;
                }
                else if(numberOf_B_3Deck >= 2 && !player3Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("B","");
                    }
                    player3Point = player3Point + 2;
                    System.out.println("R2");
                    player3Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route2 = "BB";
                    numberOf_B_3Deck -=2;
                }
                else if(numberOf_G_3Deck >= 2 && !player3Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("G","");
                    }
                    player3Point = player3Point + 2;
                    System.out.println("R2");
                    player3Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route2 = "GG";
                    numberOf_G_3Deck -=2;
                }
                else if(numberOf_Y_3Deck  >=2 && !player3Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("Y","");
                    }
                    player3Point = player3Point + 2;
                    System.out.println("R2");
                    player3Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route2 = "YY";
                    numberOf_Y_3Deck -=2;
                }
                else if(numberOf_M_3Deck  >= 2 && !player3Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("M","");
                    }
                    player3Point = player3Point + 2;
                    System.out.println("R2");
                    player3Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route2 = "MM";
                    numberOf_M_3Deck -=2;
                }
                else if(numberOf_R_3Deck  >= 2 && !player3Route2Completed)
                {
                    for(int i=0; i<2; i++)
                    {
                        Player3deck = Player3deck.replaceFirst("R","");
                    }
                    player3Point = player3Point + 2;
                    System.out.println("R2");
                    player3Route2Completed = true;
                    System.out.println("Route Completed!");
                    System.out.println("Current Hand: " + Player3deck );
                    player3Route2 = "RR";
                    numberOf_R_3Deck -=2;
                }
                else
                {
                    Player3deck = Player3deck + deck.substring(0, 3);
                    deck3Length = deck3Length + 3;
                    System.out.print("Card Drawn: ");
                    System.out.println(deck.substring(0, 3));
                    System.out.println("Current Hand: " + Player3deck );

                    for (int i = 0; i < 3; i++) 
            {
                if ( deck.substring(0, 3).charAt(i) == 'R') 
                {
                    numberOf_R_3Deck ++;
                 
                } 
            }   
            for (int i = 0; i < 3; i++) 
            {
                if ( deck.substring(0, 3).charAt(i) == 'G') 
                {
                    numberOf_G_3Deck ++;
                 
                } 
            }   
            for (int i = 0; i < 3; i++) 
            {
                if ( deck.substring(0, 3).charAt(i) == 'B') 
                {
                    numberOf_B_3Deck ++;
                 
                } 
            }  
            for (int i = 0; i < 3; i++) 
            {
                if ( deck.substring(0, 3).charAt(i) == 'M') 
                {
                    numberOf_M_3Deck ++;
                 
                } 
            } 
            for (int i = 0; i < 3; i++) 
            {
                if ( deck.substring(0, 3).charAt(i) == 'Y') 
                {
                    numberOf_Y_3Deck ++;
                 
                } 
            } 
            deck = deck.substring(3);
                    
                }
                    System.out.println("Route#2: " + player3Route2);
                    System.out.println("Route#3: " + player3Route3);
                    System.out.println("Route#4: " + player3Route4);
                    System.out.println("Route#5: " + player3Route5);
                    System.out.println("Route#6: " + player3Route6);

            numberOf_R_1Deck= 0;
            numberOf_R_2Deck= 0;
            numberOf_R_3Deck= 0;

            numberOf_G_1Deck= 0;
            numberOf_G_2Deck= 0;
            numberOf_G_3Deck= 0;

            numberOf_M_1Deck= 0;
            numberOf_M_2Deck= 0;
            numberOf_M_3Deck= 0;

            numberOf_B_1Deck= 0;
            numberOf_B_2Deck= 0;
            numberOf_B_3Deck= 0;

            numberOf_Y_1Deck= 0;
            numberOf_Y_2Deck= 0;
            numberOf_Y_3Deck= 0;
            deck1Length = Player1deck.length();
                deck2Length = Player2deck.length();
                deck3Length = Player3deck.length();


            }
            deck1Length = Player1deck.length();
                deck2Length = Player2deck.length();
                deck3Length = Player3deck.length();
            
            System.out.println("");
            System.out.println("Game finished!");
            System.out.print("Player1 total route points: " + player1Point);
            System.out.print("\nPlayer1's remaining card count in the hand: " + deck1Length);
            System.out.print("\nPlayer2 total route points: " + player2Point);
            System.out.print("\nPlayer2's remaining card count in the hand: " + deck2Length);
            System.out.print("\nPlayer3 total route points: " + player3Point);
            System.out.print("\nPlayer3's remaining card count in the hand: " + deck3Length);

            System.out.println("\nNumber of remaining cards on deck " + (125-deck1Length-deck2Length-deck3Length));
            System.out.println("TOTAL = 125");
        
    }
    
}
