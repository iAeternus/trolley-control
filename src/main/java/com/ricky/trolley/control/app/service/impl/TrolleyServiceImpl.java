package com.ricky.trolley.control.app.service.impl;

import com.ricky.trolley.control.app.dto.command.*;
import com.ricky.trolley.control.app.service.TrolleyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Ricky
 * @version 1.0
 * @date 2024/7/16
 * @className TrolleyServiceImpl
 * @desc
 */
@Service
public class TrolleyServiceImpl implements TrolleyService {
    @Override
    public void startAdvance(StartAdvanceCommand command) {

    }

    @Override
    public void startBackOff(StartBackOffCommand command) {

    }

    @Override
    public void startLeft(StartLeftCommand command) {

    }

    @Override
    public void startRight(StartRightCommand command) {

    }

    @Override
    public void stopAdvance(StopAdvanceCommand command) {

    }

    @Override
    public void stopBackOff(StopBackOffCommand command) {

    }

    @Override
    public void stopLeft(StopLeftCommand command) {

    }

    @Override
    public void stopRight(StopRightCommand command) {

    }
}
