package com.games.framework;

public interface Graphics {
    public static enum PixmapFormat {
        ARGB8888, ARGB4444, RGB565
    }

    public Pixmap newPixmap(String fileName, PixmapFormat format);

    public void clear(int color);

    public void drawPixel(int x, int y, int color);

    public void drawLine(int x, int y, int x2, int y2, int color);

    public void drawRect(int x, int y, int width, int height, int color);

    //x = screen x, y = screen y, srcX = image x, srcY = image y and srcWidth and height = image height and width that you want to display
    public void drawPixmap(Pixmap pixmap, int x, int y, int srcX, int srcY,
            int srcWidth, int srcHeight);
    
    public void drawPixmap(Pixmap pixmap, int x, int y, int width, int height,int srcX, int srcY,
            int srcWidth, int srcHeight);
    
    public void drawPixmap(Pixmap pixmap, int x, int y, int width, int height,int srcX, int srcY,
        int srcWidth, int srcHeight, float degrees);

    public void drawPixmap(Pixmap pixmap, int x, int y);

    public int getWidth();

    public int getHeight();
}
