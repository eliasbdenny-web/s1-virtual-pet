import javax.swing.*;

public class VPmain {

    VirtualPet vp = new VirtualPet();
    int Strong = 0;

    public VPmain() {
        vp.Start();

        String ansA = askForInput("What should I eat? Chips, yes or no");
        if (ansA != null && ansA.equalsIgnoreCase("yes")) {
            vp.getfat();
            Strong = -1;
        }

        waitABeat(1000);

        String ansB = askForInput("Should I do steroids? yes or no");
        if (ansB != null && ansB.equalsIgnoreCase("yes")) {
            vp.doDrugs();
            waitABeat(4000);
            vp.Jacked();
            Strong = 1;
        }

        String ansC = askForInput("Should I get McDonalds for dinner? yes or no");
        if (ansC != null && ansC.equalsIgnoreCase("yes")) {
            vp.getfat();
            Strong = -1;
        }

        String ansD = askForInput("Should I work out? yes or no");
        if (ansD != null && ansD.equalsIgnoreCase("yes")) {
            vp.bexercise();
            waitABeat(5000);
            vp.strong();
            Strong = 2;
        }

        String ansE = askForInput("Should I take a break from workingout? yes or no");
        if (ansE != null && ansE.equalsIgnoreCase("yes")) {
            vp.getfat();
            Strong = -1;
        } else if (ansE != null && ansE.equalsIgnoreCase("no")) {
            vp.bexercise();
            waitABeat(5000);
            vp.Jacked();
            Strong = 1;
        }

        String ansF = askForInput("Am I ready for entering competition? yes or no");
        if (ansF != null && ansF.equalsIgnoreCase("yes")) {
            vp.Won();
            Strong = -1;
        } else if (ansF != null && ansF.equalsIgnoreCase("no")) {
            vp.doDrugs();
            waitABeat(8000);
            Strong = 2;
        }
    }


    public void waitABeat(int ms) {
        try {
            Thread.sleep(ms); // milliseconds
        } catch (Exception e) {
            // Ignore interruption exceptions
        }
    }

    public String askForInput(String q) {
        String s = (String) JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VPmain();
    }
}