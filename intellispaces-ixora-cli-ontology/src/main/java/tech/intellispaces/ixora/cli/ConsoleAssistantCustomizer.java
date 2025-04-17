package tech.intellispaces.ixora.cli;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

import java.io.PrintStream;

@AssistantCustomizer(ConsoleDomain.class)
public interface ConsoleAssistantCustomizer {

  MovableConsoleHandle dummy(PrintStream ps);
}
