package org.example.contracts;

import org.example.model.Channel;

public interface ChannelIterator {

    public boolean hasNext();

    public Channel next();
}
