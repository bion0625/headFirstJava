package ch02;

class DrumKitTestDriven{
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playTopHat();
        d.snare = false;
        if(d.snare == true) {
            d.playSnare();
        }
    }
}