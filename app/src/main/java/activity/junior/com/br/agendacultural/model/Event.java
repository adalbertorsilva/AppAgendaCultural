package activity.junior.com.br.agendacultural.model;

import org.androidannotations.annotations.EBean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by junior on 09/02/16.
 */
@EBean
public class Event {

    private Integer id;
    private String title;
//    private String description;
//    private String photo;
//    private String place;
//    private String address;
//    private Date openingDate;
//    private Date endingDate;
//    private String category;
//    private BigDecimal price;
//    private Date hour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }
//
//    public String getPlace() {
//        return place;
//    }
//
//    public void setPlace(String place) {
//        this.place = place;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Date getOpeningDate() {
//        return openingDate;
//    }
//
//    public void setOpeningDate(Date openingDate) {
//        this.openingDate = openingDate;
//    }
//
//    public Date getEndingDate() {
//        return endingDate;
//    }
//
//    public void setEndingDate(Date endingDate) {
//        this.endingDate = endingDate;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public Date getHour() {
//        return hour;
//    }
//
//    public void setHour(Date hour) {
//        this.hour = hour;
//    }
}
