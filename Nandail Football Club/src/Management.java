import ModelClass.Player;

import java.util.ArrayList;

public class Management
{
    ArrayList<Player>playerList = new ArrayList<>();
    String ClubName;

    public Management(String clubName) {
        ClubName = clubName;
    }

    void addPlayer(String name,int id,String Age,String phone,String address)
    {
        Player player = new Player(name,id,Age,phone,address);
        playerList.add(player);

    }

    public void display() {
        for (Player p : playerList) {
            p.DisplayPlayer();

        }
    }
    public void SearchPlayerInfo(int id) {
        for (Player p : playerList) {

            if(p.getID()==id)
            {
                p.DisplayPlayer();
                break;
            }


        }
    }

    public void DeletePlayer(int id) {
        for (Player p : playerList) {

            if(p.getID()==id)
            {
               playerList.remove(p);
                break;
            }


        }
    }

}
