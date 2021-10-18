import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Multiple_Audio_PlayPause extends Applet implements ActionListener
{
Button b1;
int i=0;
Button b2,b3,b4;
String msg="";
AudioClip ac;
String a[]={"CS2_AutoplayMusic.wav","AgeAdvance.wav","air_conditioner_cycle.wav","airboat_drivehard.wav","airboat_gassed.wav","aircraft_distant_flyby3.wav"};
public void init()
{
b1=new Button("Play");
b2=new Button("Stop");
b3=new Button("Previous");
b4=new Button("Next");
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
msg=ae.getActionCommand();
if(msg.equals("Play"))
{
ac=getAudioClip(getDocumentBase(),a[i]);
ac.play();
}
else if(msg.equals("Stop"))
ac.stop();
else if(msg.equals("Previous"))
{
if(i==0)
i=5;
else
i--;
ac.stop();
ac=getAudioClip(getDocumentBase(),a[i]);
ac.play();
}
else if(msg.equals("Next"))
{
if(i==5)
i=0;
else
i++;
ac.stop();
ac=getAudioClip(getDocumentBase(),a[i]);
ac.play();
}
}
}
/*<applet code="Multiple_Audio_PlayPause" width=320 height=500>
</applet>*/