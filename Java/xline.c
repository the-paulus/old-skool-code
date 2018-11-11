#include <X11/Xlib.h>
#include <stdio.h>

Display *display;
int screen;

int main(int argc, char **argv[])
{
  int i, j;
  Window window;
  long fgColor, bgColor;
  int pX, pY;
  XEvent evt;
  XGCValues gcVal;
  GC draw;
  int evtMask = KeyPressMask|ExposureMask|ButtonPressMask;
  int fstPt = 1;
  char screen_name;

  display = XOpenDisplay(screen_name);
  screen = DefaultScreen(display);
  fgColor = BlackPixel(display, screen);
  bgColor = WhitePixel(display, screen);

  window = XCreateSimpleWindow(display, RootWindow(display, screen), 0, 0, 200, 200, 2, fgColor, bgColor);

  gcVal.foreground = fgColor;
  gcVal.background = bgColor;

  draw = XCreateGC(display, window, GCForeground| GCBackground, &gcVal);

  XSelectInput(display, window, evtMask);

  XMapWindow(display, window);

  for(;;)
    {
      XWindowEvent(display,window,evtMask, &evt);
      switch(evt.type)
	{
	case Expose:
	  XClearWindow(display,window);
	  break;
	case ButtonPress:
	  if(fstPt)
	    {
	      fstPt = 0;
	      pX = evt.xbutton.x;
	      pY = evt.xbutton.y;
	      XDrawPoint(display, window, draw, pX, pY);
	      break;
	    }else{
	      fstPt = 1;
	      XDrawLine(display,window,draw, pX, pY, evt.xbutton.x, evt.xbutton.y);
	      break;
	    }
	case KeyPress:
	  XDestroyWindow(display, window);
	  exit(0);
	default:
	  fprintf(stderr, "Unexpected event: %d\n", evt.type);
	}
    }
}



