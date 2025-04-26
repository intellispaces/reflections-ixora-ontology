package tech.intellispaces.ixora.cli;

import java.io.PrintStream;

import tech.intellispaces.jaquarius.annotation.AssistantCustomizer;

@AssistantCustomizer(ConsoleDomain.class)
public interface ConsoleAssistantCustomizer {

  MovableConsoleHandle dummy(PrintStream ps);
}
