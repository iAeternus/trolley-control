package com.ricky.trolley.control.app.service;

import com.ricky.trolley.control.app.dto.command.*;
import org.springframework.stereotype.Service;

/**
 * @author Ricky
 * @version 1.0
 * @date 2024/7/16
 * @className TrolleyService
 * @desc
 */
@Service
public interface TrolleyService {
    void startAdvance(StartAdvanceCommand command);

    void startBackOff(StartBackOffCommand command);

    void startLeft(StartLeftCommand command);

    void startRight(StartRightCommand command);

    void stopAdvance(StopAdvanceCommand command);

    void stopBackOff(StopBackOffCommand command);

    void stopLeft(StopLeftCommand command);

    void stopRight(StopRightCommand command);
}
