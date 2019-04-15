PImage mustache;
PImage friend;

void setup() {
  
  friend = loadImage ("friend.png");
  size(800,600);
  friend.resize (800,600);
  mustache = loadImage ("mustache.png");
  mustache.resize (400,300);
}
void draw(){
  background(friend);
  if(mousePressed)
  image(mustache, mouseX, mouseY);
  
}