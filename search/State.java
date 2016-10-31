package search;

import java.util.Set;

import npuzzle.Tiles;

public interface State {
	Set<? extends Action> getApplicableActions();
	State getActionResult(Action action);
	boolean equals(Object anotherState);
	int hashCode();
	boolean equals(Tiles anotherState);
}
