package techkids.vn.buildpc.databases;

/**
 * Created by ADMIN on 6/30/2017.
 */

public class BuildPCModel {
    private String company;
    private String specie;
    private String socket;
    private String speed;
    private String igp;
    private String ram_support;
    private String core;
    private String thread;
    private String cache;
    private String lithography;
    private String tdp;
    private float price;
    private String image;

    public BuildPCModel(String company, String specie, String socket, String speed, String igp, String ram_support, String core, String thread, String cache, String lithography, String tdp, float price, String image) {
        this.company = company;
        this.specie = specie;
        this.socket = socket;
        this.speed = speed;
        this.igp = igp;
        this.ram_support = ram_support;
        this.core = core;
        this.thread = thread;
        this.cache = cache;
        this.lithography = lithography;
        this.tdp = tdp;
        this.price = price;
        this.image = image;
    }

    public String getRam_support() {
        return ram_support;
    }

    public void setRam_support(String ram_support) {
        this.ram_support = ram_support;
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getIgp() {
        return igp;
    }

    public void setIgp(String igp) {
        this.igp = igp;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getLithography() {
        return lithography;
    }

    public void setLithography(String lithography) {
        this.lithography = lithography;
    }

    public String getTdp() {
        return tdp;
    }

    public void setTdp(String tdp) {
        this.tdp = tdp;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
