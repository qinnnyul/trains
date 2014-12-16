package com.thoughtworks.trains.domain;

import java.util.List;

public class Route
{
    private final Station source;
    private final Station target;

    private List<Station> details;

    public Route(Station source, Station target)
    {
        this.source = source;
        this.target = target;
    }


    public Station getSource()
    {
        return source;
    }

    public Station getTarget()
    {
        return target;
    }

    public List<Station> getDetails()
    {
        return details;
    }

    public void setDetails(List<Station> details)
    {
        this.details = details;
    }
}
