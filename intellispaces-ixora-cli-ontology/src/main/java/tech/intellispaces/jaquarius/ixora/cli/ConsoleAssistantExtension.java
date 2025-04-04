package tech.intellispaces.jaquarius.ixora.cli;

import tech.intellispaces.ixora.cli.ConsoleDomain;
import tech.intellispaces.ixora.cli.MovableConsoleHandle;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

import java.io.PrintStream;

@AssistantExtension(ConsoleDomain.class)
public interface ConsoleAssistantExtension {

  MovableConsoleHandle create(PrintStream ps);
}
