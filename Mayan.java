class Mayan extends Language {
  
  public Mayan(String nm, int nums) {
    super(nm, nums, "Central America", "verb-object-subject");
  }
  
  @Override
  public void getInfo() {
    System.out.println("Ki'che' is spoken by 2330000 people mainly in Central America.The language follows the word order: verb-object-subject Fun fact: Ki'che' is an ergative language.");
  }

  
  
}
