Create a class Player with below attributes: 

playerId - int 
skill - String 
level - String 
points - int

Above attribute is Private.
Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

findPointsForGivenSkill method: 
------------------------------------
This method will take two input parameters - array of Player objects 
and string parameter skill. The method will return the sum of the points attribute from player objects for the skill passed as parameter. If no player with the given skill is present in the array of player objects, then the method should return 0.

getPlayerBasedOnLevel method: 
-------------------------------------
This method will take two String parameters level and skill, along with the array of Player objects. 
The method will return the player object, if the input String parameters matches with the level and skill attribute of the player object and its point attribute is greater than or equal to 20.
If any of the conditions are not met, then the method should return null.

Note : No two player object would have the same value for skill and level attribute. All player object would have the points greater than 0. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.

For findPointsForGivenSkill method - The main method should print the points as it is if the returned price is greater than 0, or it should print "The given Skill is not available".

For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object.
If the returned value is null then it should print "No player is available with specified level, skill 
and eligibility points".

Before calling these static methods in main, use Scanner object to read the values of four Player objects referring attributes in the above mentioned attribute sequence. Next, read the value for skill and level.
Please consider the skill value read above as skill parameter for both the static methods.

Input:
-----------
101
Cricket
Basic
20

102
Cricket
Intermediate
25

111
Football
Intermediate
50

113
BaseBall
Advanced
100

Cricket
Intermediate

Output:
--------------
45
102

Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(),
nextDouble() etc.
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those
methods.


-------------------------------------------------------------------------------------------------------------------------->EXPLANATION

import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Player[] pl=new Player[4];
//        playerId - int
//        skill - String
//        level - String
//        points - int
        for(int i=0;i<pl.length;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            pl[i]=new Player(a,b,c,d);
        }
        String skills=sc.nextLine();
        String level=sc.nextLine();
        int ans=findPointsForGivenSkill(pl,skills);
        if(ans>0)
            System.out.println(ans);
        else
            System.out.println("The given Skill is not available");

        int ans2=getPlayerBaseOnLevel(pl,level,skills);
        if(ans2>0)
            System.out.println(ans2);
        else
            System.out.println("No player is available with specified level");
    }

    public static int findPointsForGivenSkill(Player[] pl,String skill){
        int count=0;
        for(int i=0;i<pl.length;i++){
            if(skill.equalsIgnoreCase(pl[i].getSkill())){
                count+=pl[i].getPoints();
            }
        }
        if(count>0)
            return count;
        else
            return 0;

    }

    public static int getPlayerBaseOnLevel(Player[] pl,String level,String skill){
        for(int i=0;i<pl.length;i++){
            if(level.equalsIgnoreCase(pl[i].getLevels()) && skill.equalsIgnoreCase(pl[i].getSkill()) && (pl[i].getPoints()>=20)){
                return pl[i].getPlayerId();
            }
        }
        return 0;
    }

}

class Player{
//    attributes
    private int playerId;
    private String skill;
    private String levels;
    private int points;

//    constructor
    public Player(int playerId,String skill,String levels,int points){
        this.playerId=playerId;
        this.skill=skill;
        this.levels=levels;
        this.points=points;
    }

//    Setter
    public void setPlayerId(int playerId){
        this.playerId=playerId;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public void setPoints(int points) {
        this.points = points;
    }

//    getter
    public int getPlayerId(){
        return playerId;
    }

    public String getSkill() {
        return skill;
    }

    public String getLevels() {
        return levels;
    }

    public int getPoints() {
        return points;
    }
}
