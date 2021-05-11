package io.github.lucasstarsz.fastj.math;

import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.Objects;

/**
 * Class that defines a point in 2D space, using floats.
 *
 * @author Andrew Dey
 * @version 1.0.0
 */
public class Pointf {

    /** {@code Pointf} representing the origin as a {@code float}: {@code (0f, 0f)}. */
    public static final Pointf Origin = new Pointf();

    /** The x value of the {@link Pointf}. */
    public float x;
    /** The y value of the {@link Pointf}. */
    public float y;

    /** {@code Pointf} constructor, where its x and y values are set to zero. */
    public Pointf() {
        this(0f, 0f);
    }

    /**
     * {@code Pointf} constructor, where the values for the newly created {@code Pointf} are set to the float
     * parameter's values.
     *
     * @param xy Value to set the x and y of this {@code Pointf} to.
     */
    public Pointf(float xy) {
        this(xy, xy);
    }

    /**
     * {@code Pointf} constructor, where the values for the newly created {@code Pointf} are set to the parameter {@code
     * Pointf}'s values.
     *
     * @param p {@code Pointf} to set the x and y of this {@code Pointf} to.
     */
    public Pointf(Pointf p) {
        this(p.x, p.y);
    }

    /**
     * {@code Pointf} constructor, where the values for the newly created {@code Pointf} are set to the parameter {@code
     * Point}'s values.
     *
     * @param p {@code Point} to set the x and y of this {@code Pointf} to.
     */
    public Pointf(Point p) {
        this(p.x, p.y);
    }

    /**
     * {@code Pointf} constructor, where the values for the newly created {@code Pointf} are set to the specified x and
     * y parameters.
     *
     * @param xVal Value to define the x coordinate for this {@code Pointf} object.
     * @param yVal Value to define the y coordinate for this {@code Pointf} object.
     */
    public Pointf(float xVal, float yVal) {
        x = xVal;
        y = yVal;
    }

    /**
     * Static method to add two {@code Pointf}s (from the parameters specified) together, and return a new {@code
     * Pointf} object.
     *
     * @param p1 The first {@code Pointf} used for addition.
     * @param p2 The second {@code Pointf} used for addition.
     * @return Returns a new {@code Pointf} with coordinates equal to the added values from the two {@code Pointf}s.
     */
    public static Pointf add(Pointf p1, Pointf p2) {
        return new Pointf(p1.x + p2.x, p1.y + p2.y);
    }

    /**
     * Static method to add a {@code Pointf} object by a float value, and return a new {@code Pointf}.
     *
     * @param p The {@code Pointf} used for addition.
     * @param f float value used for addition.
     * @return Returns a new {@code Pointf} with coordinates equal to the added values from the {@code Pointf} and the
     * float value.
     */
    public static Pointf add(Pointf p, float f) {
        return new Pointf(p.x + f, p.y + f);
    }

    /**
     * Static method to subtract two Points (from the parameters specified) together, and return a new {@code Pointf}
     * object.
     *
     * @param p1 The first {@code Pointf} used for subtraction; the {@code Pointf} acting as the first value in
     *           subtraction.
     * @param p2 The second {@code Pointf} used for subtraction; the {@code Pointf} acting as the second value in
     *           subtraction.
     * @return Returns a new {@code Pointf} with coordinates equal to the subtracted values from the two {@code
     * Pointf}s.
     */
    public static Pointf subtract(Pointf p1, Pointf p2) {
        return new Pointf(p1.x - p2.x, p1.y - p2.y);
    }

    /**
     * Static method to subtract a {@code Pointf} object by a float value, and return a new {@code Pointf}.
     *
     * @param p The {@code Pointf} used for subtraction; the {@code Pointf} acting as the first value in subtraction.
     * @param f float value used for subtraction; the second value used in subtraction.
     * @return Returns a new {@code Pointf} with coordinates equal to the subtracted values from the {@code Pointf} and
     * the float value.
     */
    public static Pointf subtract(Pointf p, float f) {
        return new Pointf(p.x - f, p.y - f);
    }

    /**
     * Static method to multiply two {@code Pointf} objects (from the parameters specified) together, and return a new
     * {@code Pointf}.
     *
     * @param p1 The first {@code Pointf} used for multiplication.
     * @param p2 The second {@code Pointf} used for multiplication.
     * @return Returns a new {@code Pointf} with coordinates equal to the multiplied values from the two {@code
     * Pointf}s.
     */
    public static Pointf multiply(Pointf p1, Pointf p2) {
        return new Pointf(p1.x * p2.x, p1.y * p2.y);
    }

    /**
     * Static method to multiply a {@code Pointf} object by a float value, and return a new {@code Pointf}.
     *
     * @param p The {@code Pointf} used for multiplication.
     * @param f float value used for multiplication.
     * @return Returns a new {@code Pointf} with coordinates equal to the multiplied values from the {@code Pointf} and
     * the float value.
     */
    public static Pointf multiply(Pointf p, float f) {
        return new Pointf(p.x * f, p.y * f);
    }

    /**
     * Static method to divide two {@code Pointf} objects (from the parameters specified) together, and return a new
     * {@code Pointf}.
     *
     * @param p1 The first {@code Pointf} used for division; the {@code Pointf} acting as the first value in division.
     * @param p2 The second {@code Pointf} used for division; the {@code Pointf} acting as the second value in
     *           division.
     * @return Returns a new {@code Pointf} with coordinates equal to the divided values from the two {@code Pointf}s.
     */
    public static Pointf divide(Pointf p1, Pointf p2) {
        return new Pointf(p1.x / p2.x, p1.y / p2.y);
    }

    /**
     * Static method to divide a {@code Pointf} object by a float value, and return a new {@code Pointf}.
     *
     * @param p The {@code Pointf} used for division; the {@code Pointf} acting as the first value in division.
     * @param f float value used for division; the second value used in division.
     * @return Returns a new {@code Pointf} with coordinates equal to the divided values from the {@code Pointf} and the
     * float value.
     */
    public static Pointf divide(Pointf p, float f) {
        return new Pointf(p.x / f, p.y / f);
    }

    /**
     * Sets the x and y values of this {@code Pointf} object to the values specified.
     *
     * @param newX Float value used to set the new x value for this {@code Pointf} object.
     * @param newY Float value used to set the new y value for this {@code Pointf} object.
     */
    public void set(float newX, float newY) {
        x = newX;
        y = newY;
    }

    /**
     * Determines whether a specified Rectangle2D object intersects with this {@code Pointf} object.
     *
     * @param metrics Rectangle2D object used to check for intersection between this {@code Pointf} object and it.
     * @return Returns a boolean value that defines whether the Rectangle2D and this {@code Pointf} object intersect.
     */
    public boolean intersects(Rectangle2D metrics) {
        if (metrics.getX() <= x && x <= (metrics.getX() + metrics.getWidth())) {
            return (metrics.getY()) <= y && y <= (metrics.getY() + metrics.getHeight());
        }
        return false;
    }

    /**
     * Determines whether a specified Path2D object intersects with this {@code Pointf} object.
     *
     * @param path Path2D object used to check for intersection between this {@code Pointf} object and it.
     * @return Returns a boolean value that defines whether the Path2D and this {@code Pointf} object intersect.
     */
    public boolean intersects(Path2D path) {
        return Path2D.contains(path.getPathIterator(null), x, y, 1, 1);
    }

    /**
     * Gets a copy of the {@code Pointf}, and returns the copy.
     *
     * @return The new {@code Pointf}.
     */
    public Pointf copy() {
        return new Pointf(x, y);
    }

    /** Resets this {@code Pointf}'s x and y values to zero. */
    public void reset() {
        x = 0;
        y = 0;
    }

    /**
     * Adds the values of this {@code Pointf} to the specified {@code Pointf}, and returns a new {@code Pointf} with the
     * modified values.
     *
     * @param p {@code Pointf} to add this {@code Pointf} to.
     * @return Returns this {@code Pointf}, with the modified values.
     */
    public Pointf add(Pointf p) {
        x += p.x;
        y += p.y;

        return this;
    }

    /**
     * Adds the values of this {@code Pointf} to the specified float value, and returns a new {@code Pointf} with the
     * modified values.
     *
     * @param f Value to add this {@code Pointf} to.
     * @return Returns this {@code Pointf}, with the modified values.
     */
    public Pointf add(float f) {
        x += f;
        y += f;

        return this;
    }

    /**
     * Subtracts the values of this {@code Pointf} by the specified {@code Pointf}, and returns a new {@code Pointf}
     * with the modified values.
     *
     * @param p {@code Pointf} to subtract this {@code Pointf} by.
     * @return Returns this {@code Pointf}, with the modified values.
     */
    public Pointf subtract(Pointf p) {
        x -= p.x;
        y -= p.y;

        return this;
    }

    /**
     * Subtracts the values of this {@code Pointf} by the specified float value, and returns a new {@code Pointf} with
     * the modified values.
     *
     * @param f Value to subtract this {@code Pointf} by.
     * @return Returns this {@code Pointf}, with the modified values.
     */
    public Pointf subtract(float f) {
        x -= f;
        y -= f;

        return this;
    }

    /**
     * Multiplies the values of this {@code Pointf} by the specified {@code Pointf}, and returns a new {@code Pointf}
     * with the modified values.
     *
     * @param p {@code Pointf} to multiply this {@code Pointf} by.
     * @return Returns this {@code Pointf}, with the modified values.
     */
    public Pointf multiply(Pointf p) {
        x *= p.x;
        y *= p.y;

        return this;
    }

    /**
     * Multiplies the values of this {@code Pointf} by the specified float value, and returns a new {@code Pointf} with
     * the modified values.
     *
     * @param f Value to multiply this {@code Pointf} by.
     * @return Returns this {@code Pointf}, with the modified values.
     */
    public Pointf multiply(float f) {
        x *= f;
        y *= f;

        return this;
    }

    /**
     * Divides the values of this {@code Pointf} by the specified {@code Pointf}, and returns a new {@code Pointf} with
     * the modified values.
     *
     * @param p {@code Pointf} to divide this {@code Pointf} by.
     * @return Returns this {@code Pointf}, with the modified values.
     */
    public Pointf divide(Pointf p) {
        x /= p.x;
        y /= p.y;

        return this;
    }

    /**
     * Divides the values of this {@code Pointf} by the specified float value, and returns a new {@code Pointf} with the
     * modified values.
     *
     * @param f Value to divide this {@code Pointf} by.
     * @return Returns this {@code Pointf}, with the modified values.
     */
    public Pointf divide(float f) {
        x /= f;
        y /= f;

        return this;
    }

    /**
     * Calculates and returns the square magnitude of the {@code Pointf}.
     *
     * @return The square magnitude of the {@code Pointf}'s {@link #x} and {@link #y} values.
     */
    public float squareMagnitude() {
        return (x * x) + (y * y);
    }

    /**
     * Calculates and returns the {@code length}, or {@code magnitude}, of the {@code Pointf}.
     *
     * @return The magnitude, calculated using floating-point versions of the {@code Pointf}'s {@link #x} and {@link #y}
     * values.
     */
    public float magnitude() {
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /**
     * Compares the {@code Pointf} with a {@link Point}, and returns whether their {@code x} and {@code y} values are
     * equal.
     *
     * @param other The {@code Point} to compare against.
     * @return Whether the two's {@code x} and {@code y} values are equal.
     */
    public boolean equalsPoint(Point other) {
        return Maths.floatEquals(other.x, x) && Maths.floatEquals(other.y, y);
    }

    /**
     * Compares two {@code Pointf}s, and returns whether they are equal.
     *
     * @param other The {@code Pointf} to check for equality against.
     * @return Whether the {@code Pointf}s are equal.
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Pointf pointf = (Pointf) other;
        return Maths.floatEquals(pointf.x, x) && Maths.floatEquals(pointf.y, y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /**
     * Formats the {@code Pointf}'s coordinates in a {@code String}.
     *
     * @return The coordinates of the {@code Pointf}, as a {@code String}.
     */
    @Override
    public String toString() {
        return "Pointf{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
