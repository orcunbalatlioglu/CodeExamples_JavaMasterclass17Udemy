public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
        {
            return -1;
        }

        double willBePaintedArea = width * height;
        int neededBucket = (int)Math.ceil(willBePaintedArea / areaPerBucket);
        return neededBucket-extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }

        double willBePaintedArea = width * height;
        int neededBucket = (int)Math.ceil(willBePaintedArea / areaPerBucket);
        return neededBucket;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }

        int neededBucket = (int)Math.ceil(area / areaPerBucket);
        return neededBucket;
    }
}
