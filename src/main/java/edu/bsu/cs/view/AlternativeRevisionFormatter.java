package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;
import edu.bsu.cs.model.RevisionFormatterInterface;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class AlternativeRevisionFormatter implements RevisionFormatterInterface {

    @Override
    public String format(Revision revision) {
        return String.format("%s made a change %s",
                revision.name,
                DateTimeFormatter
                        .ofPattern("uuuu-MM-dd hh:mm:ss a")
                        .withLocale(Locale.getDefault())
                        .withZone(ZoneId.systemDefault())
                        .format(revision.timestamp));
    }

}