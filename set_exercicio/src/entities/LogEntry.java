package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String username;
    private Date date;

    public LogEntry(String username, Date date) {
        this.username = username;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry logEntry)) return false;
        return Objects.equals(getUsername(), logEntry.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
}
