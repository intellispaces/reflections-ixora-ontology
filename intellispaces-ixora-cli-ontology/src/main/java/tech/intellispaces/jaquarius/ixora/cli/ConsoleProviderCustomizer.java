package tech.intellispaces.jaquarius.ixora.cli;

import tech.intellispaces.ixora.cli.ConsoleDomain;
import tech.intellispaces.ixora.cli.MovableConsoleHandle;
import tech.intellispaces.jaquarius.annotation.ArtifactExtension;
import tech.intellispaces.jaquarius.artifact.ArtifactTypes;

import java.io.PrintStream;

@ArtifactExtension(origin = ConsoleDomain.class, target = ArtifactTypes.ObjectProvider)
public interface ConsoleProviderCustomizer {

  MovableConsoleHandle create(PrintStream ps);
}
