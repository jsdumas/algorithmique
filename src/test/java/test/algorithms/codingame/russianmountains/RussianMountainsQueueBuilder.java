package test.algorithms.codingame.russianmountains;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import algorithms.codingame.russianmountains.GroupOfPerson;
import algorithms.codingame.russianmountains.RussianMountainsQueue;

public class RussianMountainsQueueBuilder {

	private static final String FILE_NAME = "src/test/resources/groups_of_many_people.txt";
	private final RussianMountainsQueue russianMountainsQueue;

	public RussianMountainsQueueBuilder() {
		this.russianMountainsQueue = new RussianMountainsQueue();
	}

	public RussianMountainsQueueBuilder with(GroupOfPerson groupQueue) {
		russianMountainsQueue.addGroup(groupQueue);
		return this;
	}

	public RussianMountainsQueue build() {
		return russianMountainsQueue;
	}

	public RussianMountainsQueueBuilder withManyPeople() {
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
			String currentLine;
			try {
				while ((currentLine = bufferedReader.readLine()) != null) {
					russianMountainsQueue.addGroup(new GroupOfPerson(Long.parseLong(currentLine)));
				}
			} catch (NumberFormatException | IOException e) {
				System.out.println("withManyPeople " + e);
			}
		} catch (FileNotFoundException e) {
			System.out.println("withManyPeople " + e);
		}
		return this;
	}

}
