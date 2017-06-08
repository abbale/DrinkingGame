package game.drinking.id.drinkinggame;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    Card[] stack = new Card[13];
    Card selectedCard;
    int kingFlag = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);


        stack[1] = new Card("A","Waterfall","To perform a waterfall, each player starts drinking their beverage at the same time as the person to their left. No player can stop drinking until the player before them stops.");
        stack[2] = new Card("2","Give 2 & possibly a third","You point at two persons and tell them to drink. You can also tell one person to take two drinks.");
        stack[3] = new Card("3","Take 3","\"Three is me.\" You take three drinks.");
        stack[4] = new Card("4","Give 2 Take 2","You give out two drinks, and take two yourself.");
        stack[5] = new Card("5","Rule","Set a rule to be followed, e.g. drink with your left hand, tap your head before you drink, don't use first names, etc.");
        stack[6] = new Card("6","Thumbs","Set a rule to be followed, e.g. drink with your left hand, tap your head before you drink, don't use first names, etc.");
        stack[7] = new Card("7","Raise your hand to heaven","Last person to raise their hand will drink.");
        stack[8] = new Card("8","Mate","Choose a person to be your mate and they drink when you drink for the rest of the game.");
        stack[9] = new Card("9","Rhyme Time","\"Nine is Rhyme\". You say a word, and the person to your right has to say a word that rhymes. This continues around the table until someone cannot think of a word. This person must drink. The same word may not be used twice.");
        stack[10] = new Card("10","Categories","You come up with a category of things, and the person to your right must come up with something that falls within that category. This goes on around the table until someone can't come up with anything. This person must drink.");
        stack[11] = new Card("J","Guys Drink","All the guys at the table must take a drink");
        stack[12] = new Card("Q","Gals Drink","All the gals at the table must take a drink");
        stack[13] = new Card("K","King's Cup","When each of the first 3 Kings are drawn, the person who drew the card puts some of their drink into the King's Cup at the center of the table. When the 4th King is drawn, the person who drew the 4th King must drink the contents of the King's Cup.");

        selectedCard = stack[(int)(Math.random()*12 + 1)];
        if (selectedCard.getNameOfCard().equals("K"))
            kingFlag++;
        if (kingFlag == 4)
            System.out.println("The forth KING drown!");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
