package com.compi.bridge.formatter;

import com.compi.bridge.model.Detail;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);

}
