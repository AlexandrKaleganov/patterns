package ru.example.patterns.momento;

/**
 * Class Originator
 */
public class Originator {
    String state;

    public void setState(String state) {
        this.state = state;
    }

    public Originator.Moment saveState() {
        return  new Moment(this.state);
    }
    public String restoreMoment(Moment moment) {
        this.state = moment.state;
        return this.state;
    }
    static class Moment {
        String state;
        public Moment(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
