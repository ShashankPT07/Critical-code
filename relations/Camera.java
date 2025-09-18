class Camera {
    public String cameraLens;
    public Lens lens;

    public Camera(Lens lens) {
        this.cameraLens = lens.lensType;
        this.lens = lens;
    }

    public void displayCamera() {
        lens.lensDetails();
    }
}
