/*
 * MIT License
 *
 * Copyright (c) 2020 Fontany--Legall Brandon
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package xyz.brandonfl.throwableoptional;

import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Function;

/**
 * ThrowableOptional is a utility class that enables the possibility to use the Optional with functions that can throw exceptions
 *
 * @author brandonfl
 */
public final class ThrowableOptional {

    private ThrowableOptional() {
    }

    /**
     * ThrowableOptional of callable functions
     * Exemple :
     * {@code ThrowableOptional.of(() -> Long.parseLong(value))}
     *
     * @param function a callable function
     * @param <T> Type of the parameter
     * @return Optional of the throwable function
     */
    public static <T> Optional<T> of(Callable<T> function) {
        try {
            return Optional.ofNullable(function.call());
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    /**
     * ThrowableOptional of functions with one parameter
     * Exemple :
     * {@code ThrowableOptional.of(Long::parseLong, value)}
     *
     * @param function the function call
     * @param parameter the parameter for the function
     * @param <T> Type of the parameter
     * @param <R> Result of the function
     * @return Optional of the throwable function
     */
    public static <T, R> Optional<R> of(Function<T, R> function, T parameter) {
        try {
            return Optional.ofNullable(function.apply(parameter));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}