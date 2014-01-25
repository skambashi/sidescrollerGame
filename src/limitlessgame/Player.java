package limitlessgame;

public class Player {
	private int centerX = 100;
	private int centerY = 382;
	private boolean jumped = false;

	private int speedX = 0;
	private int speedY = 1;

	public void update() {

		// Moves Character or Scrolls Background accordingly.
		if (speedX < 0) {
			centerX += speedX; // This changes centerX by adding speedX.
		} else if (speedX == 0) {
			System.out.println("Do not scroll the background.");

		} else {
			if (centerX <= 150) { // If the character's centerX is in the left
									// 150 pixels
				centerX += speedX; // Change centerX by adding speedX.
			} else {
				System.out.println("Scroll Background Here");
			}
		}

		// Updates Y Position
		if (centerY + speedY >= 382) {
			// 382 is where the character's centerY would be if he were standing
			// on the ground.
			centerY = 382;
		} else {
			centerY += speedY; // Add speedY to centerY to determine its new
								// position
		}

		// Handles Jumping
		if (jumped == true) {
			speedY += 1; // While the character is in the air, add 1 to his
							// speedY.
							// NOTE: This will bring the character downwards!

			if (centerY + speedY >= 382) {
				centerY = 382;
				speedY = 0;
				jumped = false;
			}

		}

		// Prevents going beyond X coordinate of 0
		if (centerX + speedX <= 60) { // If speedX plus centerX would bring the
										// character //outside the screen,
			centerX = 61;
			// Fix the character's centerX at 60 pixels.
		}
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public boolean isJumped() {
		return jumped;
	}

	public int getSpeedX() {
		return speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public void setJumped(boolean jumped) {
		this.jumped = jumped;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
}
