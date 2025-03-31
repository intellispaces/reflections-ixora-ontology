package tech.intellispaces.jaquarius.ixora.cli;

import tech.intellispaces.ixora.cli.ConsoleDomain;
import tech.intellispaces.ixora.cli.MovableConsoleHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactCustomizer;

import java.io.PrintStream;

@ArtifactCustomizer(origin = ConsoleDomain.class, target = "ObjectProvider")
public interface ConsoleProviderCustomizer {

  MovableConsoleHandle create(PrintStream ps);
}
