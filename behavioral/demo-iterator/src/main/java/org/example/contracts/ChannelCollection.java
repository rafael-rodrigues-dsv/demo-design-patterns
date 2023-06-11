package org.example.contract;

import org.example.model.Channel;
import org.example.enums.ChannelTypeEnum;

public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);

}
