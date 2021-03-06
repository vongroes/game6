package com.example.game6;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    int i = 1;
    int drunkenDragon = 0;
    int thePuddlei = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button16 = (Button) findViewById(R.id.button1);
        final Button button26 = (Button) findViewById(R.id.button2);
        final Button button36 = (Button) findViewById(R.id.button3);
        final Button button46 = (Button) findViewById(R.id.button4);
        final Button button56 = (Button) findViewById(R.id.button5);
        final Button button66 = (Button) findViewById(R.id.button6);
        final Button button76 = (Button) findViewById(R.id.button7);
        final Button button86 = (Button) findViewById(R.id.button8);


        final Button button = (Button) findViewById(R.id.moneybutton);
        final TypeWriter tw = (TypeWriter) findViewById(R.id.moneytext1);
        final ImageView eyelid1 = (ImageView) findViewById(R.id.eyelid1);
        final ImageView eyelid2 = (ImageView) findViewById(R.id.eyelid2);
        final ImageView street = (ImageView) findViewById(R.id.street);
        final ImageView bar = (ImageView) findViewById(R.id.bar);
        final ImageView bar2 = (ImageView) findViewById(R.id.bar2);
        final ImageView thePuddle = (ImageView) findViewById(R.id.thepuddle);

        button.setBackgroundResource(R.drawable.nothing);

        button16.setVisibility(View.GONE);
        button26.setVisibility(View.GONE);
        button36.setVisibility(View.GONE);
        button46.setVisibility(View.GONE);
        button56.setVisibility(View.GONE);
        button66.setVisibility(View.GONE);
        button76.setVisibility(View.GONE);
        button86.setVisibility(View.GONE);
        bar.setVisibility(View.GONE);
        bar2.setVisibility(View.GONE);
        thePuddle.setVisibility(View.GONE);

        tw.setText("");
        tw.setCharacterDelay(75);
        tw.animateText("Tap your screen to open your eyes!..");

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (i == 1){
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether
                            (ObjectAnimator.ofFloat
                                            (eyelid1, "translationY", -700f),
                                    ObjectAnimator.ofFloat
                                                (eyelid2, "translationY", +700f));
                    animatorSet.setDuration(2500);
                    animatorSet.start();
                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("try tapping again to look around!..");
                }

                if (i == 2) {
                    ObjectAnimator animation = ObjectAnimator.ofFloat
                            (street, "translationX", 1000f);
                    animation.setDuration(2000);
                    animation.start();

                    animation.addListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animator ani2) {
                            ObjectAnimator animation2 = ObjectAnimator.ofFloat
                                    (street, "translationX", -1000f);
                            animation2.setDuration(4000);
                            animation2.start();

                            animation2.addListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    ObjectAnimator animation3 = ObjectAnimator.ofFloat
                                            (street, "translationX", 000f);
                                    animation3.setDuration(2500);
                                    animation3.start();
                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {

                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            });
                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {

                        }
                    });
                    tw.setTextSize(20);
                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("You open your eyes and find yourself on the streets of Malibu. " +
                            "The moon shines bright on the clear night sky and you breathe in the fresh air. \n \n" +
                            "You have a feeling this is going to be a night to remember...");
                }

                if (i == 3) {

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("You are standing in downtown Malibu. Where do you want to go?..");

                    button16.setVisibility(View.VISIBLE);
                    button26.setVisibility(View.VISIBLE);
                    button36.setVisibility(View.VISIBLE);
                    button46.setVisibility(View.VISIBLE);
                    button56.setVisibility(View.VISIBLE);
                    button66.setVisibility(View.VISIBLE);
                    thePuddle.setVisibility(View.GONE);
                    street.setVisibility(View.VISIBLE);

                    button36.setText("The puddle");
                    button66.setText("View your stats");

                    button.setVisibility(View.GONE);
                }

                if (drunkenDragon == 1) {
                    drunkenDragon = 2;

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("What do you do next?...");

                    button.setVisibility(View.GONE);
                    button36.setVisibility(View.VISIBLE);
                    button36.setText("Walk up to the bar");
                    button66.setVisibility(View.VISIBLE);
                    button66.setText("Leave..");
                }

                if (thePuddlei == 5) {

                    thePuddlei = 0;
                    i = 2;

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("You look over your shoulder and see someone laughing at you from inside the laundromat. \n \n" +
                            "you should get back to business...");
                }

                if (thePuddlei == 4) {

                    thePuddlei = 5;

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("So fine, so divine!" +
                            "\n \n \n oh yes!...");
                }

                if (thePuddlei == 3) {

                    thePuddlei = 4;

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("More sexy than can be!" +
                            "\n \n \n That's me!...");
                }

                if (thePuddlei == 2) {

                    thePuddlei = 3;

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("Too sexy by far!" +
                            "\n \n \n you are!...");
                }

                i++;
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (drunkenDragon == 0){
                    drunkenDragon = 1;
                    thePuddlei=1;

                    street.setVisibility(View.GONE);
                    button16.setVisibility(View.GONE);
                    button26.setVisibility(View.GONE);
                    button36.setVisibility(View.GONE);
                    button46.setVisibility(View.GONE);
                    button56.setVisibility(View.GONE);
                    button66.setVisibility(View.GONE);
                    button.setVisibility(View.VISIBLE);

                    bar.setVisibility(View.VISIBLE);
                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("You walk inside The Drunken Dragon.\n \n" +
                            "You're immediately met with the smell of booze and cigarettes. You look around. \n \n" +
                            "Conversations swirl in a cloud of smoke and the bartender meets your gaze...");

                }

            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (thePuddlei == 1) {

                    thePuddlei = 2;

                    street.setVisibility(View.GONE);
                    button16.setVisibility(View.GONE);
                    button26.setVisibility(View.GONE);
                    button36.setVisibility(View.GONE);
                    button46.setVisibility(View.GONE);
                    button56.setVisibility(View.GONE);
                    button66.setVisibility(View.GONE);
                    button.setVisibility(View.VISIBLE);
                    thePuddle.setVisibility(View.VISIBLE);

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("Who's a sexy beast?" +
                            "\n \n \n you are!...");
                }

                if (thePuddlei == 0) {

                    thePuddlei = 1;

                    street.setVisibility(View.GONE);
                    button16.setVisibility(View.GONE);
                    button26.setVisibility(View.GONE);
                    button46.setVisibility(View.GONE);
                    button56.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    thePuddle.setVisibility(View.VISIBLE);

                    button36.setText("Flex them muscles");
                    button66.setText("Make a funny face");

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("You walk up to the puddle in the middle of the road. " +
                            "You look down and see yourself." +
                            "\n \n What do you do?..");
                }

                if (drunkenDragon == 2) {

                    drunkenDragon = 3;

                    bar.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);

                    bar2.setVisibility(View.VISIBLE);
                    button16.setVisibility(View.VISIBLE);
                    button26.setVisibility(View.VISIBLE);
                    button46.setVisibility(View.VISIBLE);
                    button56.setVisibility(View.VISIBLE);
                    button76.setVisibility(View.VISIBLE);
                    button86.setVisibility(View.VISIBLE);


                    button16.setText("a beer 3$");
                    button26.setText("a Dimm 'N' Windy 5$");
                    button36.setText("a Sex on a peach 5$");
                    button46.setText("a Caucasian Slovenian 5$");
                    button56.setText("a Pangalactic Gargle Blaster 8$");
                    button66.setText("look for a fight");


                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("Bartender: \"What can I getcha'?\"");


                }
            }
        });

        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thePuddlei == 1) {

                    thePuddlei = 5;

                    street.setVisibility(View.GONE);
                    button16.setVisibility(View.GONE);
                    button26.setVisibility(View.GONE);
                    button36.setVisibility(View.GONE);
                    button46.setVisibility(View.GONE);
                    button56.setVisibility(View.GONE);
                    button66.setVisibility(View.GONE);
                    button.setVisibility(View.VISIBLE);
                    thePuddle.setVisibility(View.VISIBLE);

                    tw.setText("");
                    tw.setCharacterDelay(75);
                    tw.animateText("You make a very funny face!" +
                            "\n \n \nGod you are so funny...");
                }
            }
        });
    }
}
