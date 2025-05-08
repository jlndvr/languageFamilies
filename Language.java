public class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String nm, int nums, String rs, String wo) {
    this.name = nm;
    this.numSpeakers = nums;
    this.regionsSpoken = rs;
    this.wordOrder = wo;
  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The language follws the word order: " + wordOrder);
  }

  public static void main(String[] args) {
    
    Language english = new Language("English", 4500000, "North America Europe and Australia", "Subject-Verb-Object (SVO)");
    english.getInfo();

    Mayan chontal = new Mayan("Chontal", 60000);
    chontal.getInfo();

    SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 3828911);
    SinoTibetan non_chinese = new SinoTibetan ("Burmese", 2435987);

  }

}
