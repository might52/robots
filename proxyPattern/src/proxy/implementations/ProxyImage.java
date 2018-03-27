package proxy.implementations;

import proxy.interfaces.Image;

import java.net.URL;

public class ProxyImage implements Image {
    private URL url;
    public ProxyImage(URL url)    {
        this.url = url;
    }
    //this method delegates to the real image
    public void displayImage()   {
        RealImage real = new RealImage(url);
        real.displayImage();
    }
}
