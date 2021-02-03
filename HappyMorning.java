void setup() {
  size(500, 100);
}

void draw() {
  background(0);
  textSize(48);

  if (hour() < 5) {
    //between midnight and 5AM
    text("Go to sleep!", 20, height-20);
  } 
  else if (hour() < 12) {
    //between 5AM and noon
    text("Good morning!", 20, height-20);
  } 
  else if (hour() < 16) {
    //between noon and 4PM
    text("Good afternoon!", 20, height-20);
  } 
  else if (hour() < 21) {
    //between 4PM and 9PM
    text("Good evening!", 20, height-20);
  } 
  else {
    //between 9PM and midnight
    text("Good night!", 20, height-20);
  }
}
