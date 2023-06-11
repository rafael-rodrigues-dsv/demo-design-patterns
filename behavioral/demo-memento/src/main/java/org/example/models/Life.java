package org.example.model;

public class Life
{
    private String time;

    public void set(String time)
    {
        System.out.println("Setting time to " + time);
        this.time = time;
    }

    public Memento saveToMemento()
    {
        System.out.println("Saving time to Memento");
        return new Memento(time);
    }

    public void restoreFromMemento(Memento memento)
    {
        time = memento.getSavedTime();
        System.out.println("Time restored from Memento: " + time);
    }

    public static class Memento
    {
        private final String time;

        public Memento(String timeToSave)
        {
            time = timeToSave;
        }

        public String getSavedTime()
        {
            return time;
        }
    }
}
