package sample;

public class ModelTable {
    String id,name,lastname,movie,date,hour,saloon,seat;

    public ModelTable(String id, String name, String lastname, String movie, String date, String hour, String saloon, String seat) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.movie = movie;
        this.date = date;
        this.hour = hour;
        this.saloon = saloon;
        this.seat = seat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getSaloon() {
        return saloon;
    }

    public void setSaloon(String saloon) {
        this.saloon = saloon;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
