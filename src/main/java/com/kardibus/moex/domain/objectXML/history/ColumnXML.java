package com.kardibus.moex.domain.objectXML.history;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("column")
public class ColumnXML {

    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;

    @XStreamAlias("type")
    @XStreamAsAttribute
    private String type;

    @XStreamAlias("bytes")
    @XStreamAsAttribute
    private String bytes;

    @XStreamAlias("max_size")
    @XStreamAsAttribute
    private String max_size;
}
