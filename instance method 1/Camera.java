 class Camera {

    private String brand = "Canon";
    private String model = "EOS R5";
    private int resolutionMP = 45;        
    private String lensType = "RF 24-70mm";
    private double zoomLevel = 5.0;       
    private boolean isMirrorless = true;

    public String getBrand() {
		 System.out.println(brand);
        return brand;
    }

    public String getModel() {
		 System.out.println(model);
        return model;
    }

    public int getResolutionMP() {
		 System.out.println(resolutionMP);
        return resolutionMP;
    }

    public String getLensType() {
		 System.out.println(lensType);
        return lensType;
    }

    public double getZoomLevel() {
		 System.out.println(zoomLevel);
        return zoomLevel;
    }

    public boolean isMirrorless() {
		 System.out.println(isMirrorless);
        return isMirrorless;
    }
}