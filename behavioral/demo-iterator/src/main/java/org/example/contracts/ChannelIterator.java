package org.example.contracts;

import org.example.models.Channel;

public interface ChannelIterator {

    public boolean hasNext();

    public Channel next();
}
