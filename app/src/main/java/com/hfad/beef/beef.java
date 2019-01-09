package com.hfad.beef;

public class beef {
    private String name;
    private String description;
    private String cookingDescription;
    private int imageResourceId;

    //beefs is an array of Types of Beef
    public static final beef[] beefs = {
            new beef("Chuck", "The chuck (the seven-bone steak) is located near the shoulder and neck area of the cow. Best cooked slowly overtime with a crock pot or by braising",
                    "Types of cuts include ground chuck (hamburger), chuck short ribs, stew meat, country style ribs, top blade steak, and shoulder tender medallions.", R.drawable.chuck),
            new beef("Rib", "The finest cuts of the cow. Very juicy, tender, and tasty. Best cooked over dry heat and for long periods of time, Can grill or smoke the cuts",
                    "Types of cuts include Delmonico steak, boneless ribeye roast, ribeye steaks and beef short ribs.", R.drawable.rib),
            new beef("Loin", "The loin is cut from the back of the cow, located behind the ribs. It is one of the most tender and desirable cuts of the beef. There are two parts: the shortloin and sirloin. Loin cuts are best cooked over dry heat grill.",
                    "Types of cuts include filet mignon, tenderloin steak, T-bone, strip steak, New York Strip, and KC Strip." , R.drawable.loin),
            new beef("Round", "Also known as the rump. A lean cut of meat with very little fat. Located at the back of the cow near the rear leg. Best cooked roasted or braised with low moisture hard to cut.",
                    "Types of cuts include ground beef, round steak, eye of round, tip steak, tip roast, top round and botton round roasts.", R.drawable.round),
            new beef("Flank", "A long flat cut from the abdominal muscles of a cow. One of the toughest cuts of meat. Best cooked with through moist methods such as braising.",
                    "Types of cuts include flank steak and London broil.", R.drawable.flank),
            new beef("Shortplate", "Located on the front belly of the cow below the ribs (contains a lot of cartilage)",
                   "Best cooked braised because it is tough. Highest quality beans roasted and brewed fresh", R.drawable.shortplate),
            new beef("Brisket", "Cut from the breast or lower portion of a cow. Has a lot of connective tissue, so it can be tough. Best cooked smoked or braised.",
                   "Types of cuts include boneless beef brisket and the flat-cut beef brisket.", R.drawable.brisket),
            new beef("Shank", "The shank is the leg of the cow and is tough because the leg muscle is constantly used (one of the least popular cuts, but cheap). Best cooked over a long period in liquid (best for soups, stew, or beef stock)",
                   "Types of shank include the famous dish, Osso Buco.", R.drawable.shank)
};

//Each Beef has a name, description, cooking instructions, and an image resource
    private beef(String name, String description, String cookingDescription, int imageResourceId) {
        this.name = name;
        this.description= description;
        this.cookingDescription = cookingDescription;
        this.imageResourceId = imageResourceId;
        }

    public String getDescription() {
        return description;
        }

    public String getCookingDescription() {
        return cookingDescription;
        }

    public String getName() {
        return name;
        }

    public int getImageResourceId() {
        return imageResourceId;
        }
    public String toString() {
        return this.name;
        }
}
