
/* Virtual Pet, version 1
 *
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    public boolean fat = false;
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.

    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }

    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    public void tired() {
        face.setImage("tired");
    }
    public void exercise() {

        face.setImage("exercise");
        face.setMessage("Huff Puff");
    }
     public void bexercise() {

        face.setImage("bexersize");
        face.setMessage("Huff Puff");


     }
     public void strong() {

        face.setImage("manStrong");
     }

    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }
    public void Start(){
        face.setImage("manSkinny");
        face.setMessage("Im trying to loose weight what. should I eat?");
    }
    public void getfat(){
        face.setImage("manFat");
        face.setMessage("I feel so fat now.");
        boolean fat = true;
    }
    public void getskinny(){
        face.setImage("manSkinny");
        face.setMessage("I feel so skinny now.");
    }
    public void shouldWorkout(){
        face.setMessage("Should I work out?");


    }
    public void doDrugs(){
        face.setImage("manSteroid");
        face.setMessage("I feel so strong now.");

    }
    public void veryStrong(){
        face.setImage("Jacked");
        face.setMessage("I feel so strong now.");
    }
    public void Jacked(){
        face.setImage("Jacked");
    }

    public void Won() {
        this.face.setImage("manWon");
        this.face.setMessage("I won the competition");
   }




}
// end Virtual Pet