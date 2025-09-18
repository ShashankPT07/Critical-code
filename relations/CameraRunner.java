class CameraRunner {
    public static void main(String[] args) {
        Lens lens = new Lens("Wide-Angle");
        Camera camera = new Camera(lens);
        camera.displayCamera();
    }
}