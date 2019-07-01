package com.example.keshu.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class player2 extends AppCompatActivity
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    int turn=1;
    int xwins=0;
    int owins=0;
    Boolean end=false;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player2);

        b1=(Button)findViewById(R.id.player2_b1);
        b2=(Button)findViewById(R.id.player2_b2);
        b3=(Button)findViewById(R.id.player2_b3);
        b4=(Button)findViewById(R.id.player2_b4);
        b5=(Button)findViewById(R.id.player2_b5);
        b6=(Button)findViewById(R.id.player2_b6);
        b7=(Button)findViewById(R.id.player2_b7);
        b8=(Button)findViewById(R.id.player2_b8);
        b9=(Button)findViewById(R.id.player2_b9);
        b10=(Button)findViewById(R.id.player2_b10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b1.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b1.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b1.setText("O");
                    }
                }
                results();


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b2.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b2.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b2.setText("O");
                    }
                }
                results();


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b3.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b3.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b3.setText("O");
                    }
                }
                results();


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b4.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b4.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b4.setText("O");
                    }
                }
                results();


            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b5.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b5.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b5.setText("O");
                    }
                }
                results();


            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b6.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b6.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b6.setText("O");
                    }
                }
                results();


            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b7.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b7.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b7.setText("O");
                    }
                }
                results();


            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b8.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b8.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b8.setText("O");
                    }
                }
                results();


            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b9.getText().toString().equals(""))
                {
                    if(turn==1)
                    {
                        turn=2;
                        b9.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b9.setText("O");
                    }
                }
                results();


            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                turn=1;

                end=false;
                xwins=0;
                owins=0;

                if(end==false)
                {
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                }
            }
        });




    }

    protected  void results()
    {
        String a,b,c,d,e,f,g,h,i;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        //posiblity for X wins
        //horizontal
        if(a.equals("X") && b.equals("X") && c.equals("X"))
        {
            dialoge_for_X();
            xwins=1;
            end=true;
        }
        else if(d.equals("X") && e.equals("X") && f.equals("X"))
        {
            dialoge_for_X();
            xwins=1;
            end=true;
        }
        else if(g.equals("X") && h.equals("X") && i.equals("X"))
        {
            dialoge_for_X();
            xwins=1;
            end=true;
        }
        //viretical
        else if(a.equals("X") && d.equals("X") && g.equals("X"))
        {
            dialoge_for_X();
            xwins=1;
            end=true;
        }
        else if(b.equals("X") && e.equals("X") && h.equals("X"))
        {
            dialoge_for_X();
            end=true;
            xwins=1;
        }
        else if(c.equals("X") && f.equals("X") && i.equals("X"))
        {
            dialoge_for_X();
            xwins=1;
            end=true;
        }
        //diagnal
        else if(a.equals("X") && e.equals("X") && i.equals("X"))
        {
            dialoge_for_X();
            xwins=1;
            end=true;
        }
        else if(c.equals("X") && e.equals("X") && g.equals("X"))
        {
            dialoge_for_X();
            xwins=1;
            end=true;
        }

        //posiblity for O wins
        //horizontal
        if(a.equals("O") && b.equals("O") && c.equals("O"))
        {
            dialoge_for_O();
            owins=1;
            end=true;
        }
        else if(d.equals("O") && e.equals("O") && f.equals("O"))
        {
            dialoge_for_O();
            end=true;
            owins=1;
        }
        else  if(g.equals("O") && h.equals("O") && i.equals("O"))
        {
            dialoge_for_O();
            owins=1;
            end=true;

        }
        //viretical
        else if(a.equals("O") && d.equals("O") && g.equals("O"))
        {
            dialoge_for_O();
            end=true;
            owins=1;
        }
        else if(b.equals("O") && e.equals("O") && h.equals("O"))
        {
            dialoge_for_O();
            owins=1;
            end=true;
        }
        else if(c.equals("O") && f.equals("O") && i.equals("O"))
        {
            dialoge_for_O();
            owins=1;
            end=true;
        }
        //diagnal
        else if(a.equals("O") && e.equals("O") && i.equals("O"))
        {
            dialoge_for_O();
            owins=1;
            end=true;
        }
        else if(c.equals("O") && e.equals("O") && g.equals("O"))
        {
            dialoge_for_O();
            owins=1;
            end=true;
        }

        if(!a.equals("") && !b.equals("") && !c.equals("") && !d.equals("") && !e.equals("") && !f.equals("") && !g.equals("") && !h.equals("") &&!i.equals(""))
        {
            if(owins==0 && xwins==0)
            {
                dialoge_for_draw();
                end=true;
            }
        }


        {
            if(end==true)
            {
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);



            }
        }






    }
    protected  void dialoge_for_X()
    {
        AlertDialog.Builder adb =new AlertDialog.Builder(player2.this);
        adb.setMessage("!!!   CONGRATULATIONS PLAYER 1 WINS   !!!");
        adb.setCancelable(false);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.cancel();

            }
        });
        adb.create();
        adb.show();

    }

    protected  void dialoge_for_O()
    {
        AlertDialog.Builder adb =new AlertDialog.Builder(player2.this);
        adb.setMessage("!!!   CONGRATULATIONS PLAYER 2 WINS   !!!");
        adb.setCancelable(false);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.cancel();

            }
        });
        adb.create();
        adb.show();

    }
    protected  void dialoge_for_draw()
    {
        AlertDialog.Builder adb =new AlertDialog.Builder(player2.this);
        adb.setMessage("!!!   CONGRATULATIONS GAME DRAW   !!!");
        adb.setCancelable(false);
        adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.cancel();

            }
        });
        adb.create();
        adb.show();

    }
}
